import java.io.InputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class LeitorXML {
	
	
	public Cidades carrega(InputStream inputStream) { //vem com os dados da minha url xml aqui
		XStream xstream = new XStream(new DomDriver()); //inst�ncia do meu xstream
		xstream.alias("cidades", Cidades.class); //equivalendo as tags com as respectivas classes
		xstream.alias("cidade", Cidade.class);
		xstream.addImplicitCollection(Cidades.class, "cidades"); //Aqui diz que "cidades" � uma cole��o, e temos dentro da
		//tag pai, um monte de tags filhas, isso nos indica que � uma cole��o.
		
		return (Cidades) xstream.fromXML(inputStream); //retorna um objeto cidades que � uma cole��o, com os dados xml
	}
}
