import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class ClienteWebService {
	private static final String URL_WEBSERVICE = "http://servicos.cptec.inpe.br/XML/listaCidades?city=sao%20paulo";
	
	public Cidades getCidades() {
		HttpURLConnection connection = null; //minha conexão

		try { //Não esquecer da url
			URL url = new URL(URL_WEBSERVICE); //Url do meu web service rest
			connection = (HttpURLConnection) url.openConnection(); //Abrindo uma conexão para aquela url
			InputStream content = connection.getInputStream(); //Pegando os dados da minha web service rest
			return (Cidades) new LeitorXML().carrega(content); //retornando e chamando leitorxml com seu método de carregar
			//dados retornados como uma coleção de cidades
		} catch (IOException e) {
			throw new RuntimeException("Erro na leitura do InputStream");
		} finally {
			connection.disconnect();
		}
		
	}
}
