package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader buffered = new BufferedReader(inputStreamReader);
		DecimalFormat decimalFormat = new DecimalFormat("#.0000");
		
		try {
			double raio = Double.parseDouble(buffered.readLine());
			System.out.println("A=" + decimalFormat.format(raio * raio * 3.14159));
		} catch (IOException e) {
			throw new RuntimeException("Ocorreu um erro na entrada!", e);
		}
	}
}
