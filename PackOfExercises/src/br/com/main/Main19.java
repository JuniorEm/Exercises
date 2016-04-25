package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main19 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		double x = Double.parseDouble(vetor[0]);
		double y = Double.parseDouble(vetor[1]);
				
		if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		} else if ((x == 0) && (y != 0)) {
			System.out.println("Eixo Y");
		} else if ((y == 0) && (x != 0)) {
			System.out.println("Eixo X");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Q4");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Q3");
		} else if ((x > 0) && (y > 0)) {
			System.out.println("Q1");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Q2");
		}
	}
}
