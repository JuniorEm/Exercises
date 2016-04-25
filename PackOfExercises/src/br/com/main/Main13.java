package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main13 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.000");
		
		int tempo = Integer.parseInt(br.readLine());
		int velocidade = Integer.parseInt(br.readLine());
		
		double resultado = (double) (tempo * velocidade) / 12;
		System.out.println(decimalFormat.format(resultado).replace(",", "."));
	}
}
