import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Logica {
	public static void main(String[] args) throws IOException {
		double fahrenheit;
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Vamos converter de Celsius para Fahrenheit! Digite sua temperatura atual em °C : ");
		String temp = br.readLine();
		Double temporario = new Double(temp);
		double novaTemperatura = temporario/100;
		
		fahrenheit = (novaTemperatura * 180) + 32;
		
		System.out.println("É: " + fahrenheit + " °F");
		
	}
}
