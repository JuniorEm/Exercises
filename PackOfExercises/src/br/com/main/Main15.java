package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main15 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimal = new DecimalFormat("0.0");
		int linhas = Integer.parseInt(br.readLine());
		int cont = 0;
		
		while (cont < linhas) {
			String entrada = br.readLine();
			String[] vetor = entrada.split(" ");
			double a = Double.parseDouble(vetor[0]) * 2;
			double b = Double.parseDouble(vetor[1]) * 3; 
			double c = Double.parseDouble(vetor[2]) * 5;
			
			System.out.println(decimal.format((a + b + c)/10).replace(",", ".")); 
			cont++;
		}
	}
}
