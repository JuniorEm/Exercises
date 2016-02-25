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
		
		System.out.println("Digite um número: ");
		int x = Integer.parseInt(bsr.readLine());
		
		System.out.println("Digite um outro número: ");
		int y = Integer.parseInt(bsr.readLine());
		
		
		System.out.println("Digite uma opção: ");
		String option = bsr.readLine();
		
		switch(option) {
			case "A":
				System.out.println("Resultado da Soma: " + new Treino6().soma(x, y));
				break;
			case "B":
				System.out.println("Resultado da Subtração: " + new Treino6().subtracao(x, y));
				break;
			case "C":
				System.out.println("Resultado da Divisão: " + df.format(new Treino6().divisao(x, y)));
				break;
			case "D":
				System.out.println("Resultado da Multiplicação: " + new Treino6().multiplicacao(x, y));
				break;
		}

	}
}
