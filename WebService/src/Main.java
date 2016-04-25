

import java.io.IOException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {
	
	public static void main(String[] args) {
		ClientWebService client = new ClientWebService();
		
		try {
			List<Metar> metarList = client.getMetar().getCapitais();
			
			for (Metar newMetar : metarList) {
				System.out.println("Código: " + newMetar.getCodigo());
				System.out.println("Atualização: " + newMetar.getAtualizacao());
				System.out.println("Descrição: " + newMetar.getTempo_desc());
				System.out.println("Intensidade: " + newMetar.getIntensidade());
			}
			
			XStream xstream = new XStream(new DomDriver());
			
		} catch (IOException e) {
			throw new RuntimeException("Erro de entrada/saída", e);
		}
		

	}
}
