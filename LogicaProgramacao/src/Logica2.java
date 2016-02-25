import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Logica2 {
	public static void main(String[] args) throws IOException {
		int contador = 0;
		int dia = 0;
		int mes = 0;
		int ano = 0;
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Digite a sua idade e eu direi quantos dias de vida você teve até seu último aniversário!");
		String idade = br.readLine();
		Integer integer = new Integer(idade);
		int novaIdade = integer;
		
		for (contador = 0; contador < novaIdade; contador++) { //Para dia = 0, até que dia seja menor do que novaIdade,
			ano = ano + 1;
			dia = dia + 365;
			mes = mes + 30;
			
		}
		
		System.out.println("Você tem " + dia + " dias de vida! E " + mes + " meses! E " + ano + " anos!");
	}
}
