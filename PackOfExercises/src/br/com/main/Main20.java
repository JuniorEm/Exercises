package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main20 {
	
	public static boolean existeTriangulo(double a, double b, double c) {
		return (Math.abs(b - c) < a) && (a < b + c);
	}
	
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.0");
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		double a = Double.parseDouble(vetor[0]);
		double b = Double.parseDouble(vetor[1]);
		double c = Double.parseDouble(vetor[2]);
		
		if (existeTriangulo(a, b, c) && existeTriangulo(b, a, c) && existeTriangulo(c, a, b)) {
			 System.out.println("Perimetro = " + decimalFormat.format((a + b + c)).replace(",", "."));
		} else System.out.println("Area = " + decimalFormat.format((a + b) * c / 2).replace(",", "."));
	}
	

}
