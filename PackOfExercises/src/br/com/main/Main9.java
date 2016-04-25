package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main9 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("R$ 0.00");
		
		String entrada1 = br.readLine();
		String[] vetor = entrada1.split(" ");
		int a = Integer.parseInt(vetor[0]);
		int b = Integer.parseInt(vetor[1]);
		int c = Integer.parseInt(vetor[2]);
		
		int formula1 = (a + b + Math.abs(a - b))/2;
		int formula2 = (formula1 + c + Math.abs(formula1 - c))/2;
		
		System.out.println(formula2 + " eh o maior");
	}
}
