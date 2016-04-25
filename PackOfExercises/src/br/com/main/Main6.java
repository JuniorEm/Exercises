package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main6 {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader buffered = new BufferedReader(inputStreamReader);
		DecimalFormat decimalFormat = new DecimalFormat("R$ 0.00");
		
		String nome = buffered.readLine();
		double salarioFixo = Double.parseDouble(buffered.readLine());
		double montante = Double.parseDouble(buffered.readLine());
		
		System.out.println("TOTAL = " + decimalFormat.format((salarioFixo + (montante * 15/100))).replace(",", "."));
		
	}
}
