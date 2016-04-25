package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main14 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.00000");
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		double a = Double.parseDouble(vetor[0]);
		double b = Double.parseDouble(vetor[1]);
		double c = Double.parseDouble(vetor[2]);
		
		double formula = (b * b) - (4 * a * c);
		
		double x1 = -b + Math.sqrt(formula)/(2 * a);
		double x2 = -b - Math.sqrt(formula)/(2 * a);
		
		System.out.println("R1 = " + x1 +
				"\nR2 = " + x2);
	}
}
