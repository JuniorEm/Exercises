package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main29 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String entrada = br.readLine();

		String[] vetor = entrada.split(" ");
		double valor1 = Double.parseDouble(vetor[0]);
		double valor2 = Double.parseDouble(vetor[1]);
		double valor3 = Double.parseDouble(vetor[2]);

		double maiorValor = 0.0;
		double valorComum1 = 0.0;
		double valorComum2 = 0.0;

		if ((valor1 >= valor2) && (valor1 >= valor3)) {
			maiorValor = valor1;
			valorComum1 = valor2;
			valorComum2 = valor3;
		} else {
			if ((valor2 >= valor1) && (valor2 >= valor3)) {
				maiorValor = valor2;
				valorComum1 = valor1;
				valorComum2 = valor3;
			} else {
				if ((valor3 >= valor1) && (valor3 >= valor2)) {
					maiorValor = valor3;
					valorComum1 = valor1;
					valorComum2 = valor2;
				}
			}
		}

		if (maiorValor >= valorComum1 + valorComum2)
			System.out.println("NAO FORMA TRIANGULO");
		else if ((maiorValor * maiorValor) == (valorComum1 * valorComum1) + (valorComum2 * valorComum2))
			System.out.println("TRIANGULO RETANGULO");
		else if ((maiorValor * maiorValor) > (valorComum1 * valorComum1) + (valorComum2 * valorComum2))
			System.out.println("TRIANGULO OBTUSANGULO");		
		else if ((maiorValor * maiorValor) < (valorComum1 * valorComum1) + (valorComum2 * valorComum2))
			System.out.println("TRIANGULO ACUTANGULO");
		
		
		if ((maiorValor == valorComum1) && (maiorValor == valorComum2) && (valorComum1 == valorComum2))
			System.out.println("TRIANGULO EQUILATERO");
		else if ((maiorValor == valorComum1) || (maiorValor == valorComum2) || (valorComum1 == valorComum2))
			System.out.println("TRIANGULO ISOSCELES");
	}
}
