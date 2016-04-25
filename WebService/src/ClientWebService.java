

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ClientWebService {
	private static final String URL_WEBSERVICE = "http://servicos.cptec.inpe.br/XML/capitais/condicoesAtuais.xml";
	
	public Capitais getMetar() throws IOException {
		HttpURLConnection connection = null;
		
		try {
			URL url = new URL(URL_WEBSERVICE);
			connection = (HttpURLConnection) url.openConnection();
		    InputStream content = connection.getInputStream(); //Contém a leitura da URL
		    
		    return (Capitais) new LeitorXML().carrega(content); //Retornam Capitais que seguram collections e carrega no Leitor XML
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} finally {
			connection.disconnect();
		}
	}
}
