package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main7 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("R$ 0.00");
		
		String entrada1 = br.readLine();
		String[] vetor = entrada1.split(" ");
		int codigo1 = Integer.parseInt(vetor[0]);
		int quantidade1 = Integer.parseInt(vetor[1]);
		double preco1 = Double.parseDouble(vetor[2]);
		
		String entrada2 = br.readLine();
		String[] vetor2 = entrada2.split(" ");
		int codigo2 = Integer.parseInt(vetor2[0]);
		int quantidade2 = Integer.parseInt(vetor2[1]);
		double preco2 = Double.parseDouble(vetor2[2]);
		
		System.out.println("VALOR A PAGAR: " + decimalFormat.format((quantidade1 * preco1) + (quantidade2 * preco2)).replace(",", "."));
		
	}
}
