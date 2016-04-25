package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main11 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.0000");
		
		String entrada1 = br.readLine();
		String[] vetor = entrada1.split(" ");
		double x1 = Double.parseDouble(vetor[0]);
		double y1 = Double.parseDouble(vetor[1]);
		
		String entrada2 = br.readLine();
		String[] vetor2 = entrada2.split(" ");
		double x2 = Double.parseDouble(vetor2[0]);
		double y2 = Double.parseDouble(vetor2[1]);
		
		System.out.println(decimalFormat.format(Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 -y1)))).replace(",", "."));
	}
}
