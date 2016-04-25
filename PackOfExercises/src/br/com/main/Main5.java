package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main5 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("U$ 0.00");
		
		int numero = Integer.parseInt(br.readLine());
		int horas = Integer.parseInt(br.readLine());
		double salario = Double.parseDouble(br.readLine());
		
		System.out.println("NUMBER = " + numero +
				"\nSALARY = " + decimalFormat.format(salario * horas).replace(",", "."));
		
	}
}
