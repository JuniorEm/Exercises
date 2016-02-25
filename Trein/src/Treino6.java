import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Treino6 {
	
	public int soma(int x, int y) {
		return x + y;
	}
	
	public int subtracao(int x, int y) {
		return x - y;
	}
	
	public double divisao(int x, int y) {
		return (double) x / y;
	}
	
	public int multiplicacao(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("0.##");
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bsr = new BufferedReader(isr);
		
		System.out.println("Digite um n�mero: ");
		int x = Integer.parseInt(bsr.readLine());
		
		System.out.println("Digite um outro n�mero: ");
		int y = Integer.parseInt(bsr.readLine());
		
		
		System.out.println("Digite uma op��o: ");
		String option = bsr.readLine();
		
		switch(option) {
			case "A":
				System.out.println("Resultado da Soma: " + new Treino6().soma(x, y));
				break;
			case "B":
				System.out.println("Resultado da Subtra��o: " + new Treino6().subtracao(x, y));
				break;
			case "C":
				System.out.println("Resultado da Divis�o: " + df.format(new Treino6().divisao(x, y)));
				break;
			case "D":
				System.out.println("Resultado da Multiplica��o: " + new Treino6().multiplicacao(x, y));
				break;
		}

	}
}
