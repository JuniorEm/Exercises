import java.io.InputStream;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LeitorXML {

	public Capitais carrega(InputStream fonte) {
		XStream stream = new XStream(new DomDriver());
		stream.alias("capitais", Capitais.class);
		stream.alias("metar", Metar.class);
		
		stream.addImplicitCollection(Capitais.class, "capitais"); //Permite usar uma collection
		
		return (Capitais) stream.fromXML(fonte); //O retorno são de capitais
	}
}
