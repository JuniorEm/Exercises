package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main4 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat1 = new DecimalFormat("0.0");
		DecimalFormat decimalFormat2 = new DecimalFormat("0.000");
		
		String entrada = br.readLine();
		String[] array = entrada.split(" ");
		double a = Double.parseDouble(array[0]);
		double b = Double.parseDouble(array[1]);
		double c = Double.parseDouble(array[2]);
				
		System.out.println("TRIANGULO: " + decimalFormat2.format(a * c / 2).replace(",", ".") +
				"\nCIRCULO: " + decimalFormat2.format(3.14159 * c * c).replace(",", ".") +
				"\nTRAPEZIO: " + decimalFormat2.format((a + b) * c / 2).replace(",", ".") +
				"\nQUADRADO: " + decimalFormat2.format(b * b).replace(",", ".") +
				"\nRETANGULO: " + decimalFormat2.format(a * b).replace(",", "."));
	}
}
