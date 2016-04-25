package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main31 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		DecimalFormat decimalFormat2 = new DecimalFormat("0");
		double entrada = Double.parseDouble(br.readLine());
		double percent = 0;
		double percentual = 0;
		if (entrada > 0 && entrada <= 400.00) {
			percent = entrada * 0.15;
			percentual = 15;
		} else if (entrada >= 400.01 && entrada <= 800.00) {
			percent = entrada * 0.12;
			percentual = 12;
		} else if (entrada >= 800.01 && entrada <= 1200.00) {
			percent = entrada * 0.10;
			percentual = 10;
		} else if (entrada >= 1200.01 && entrada <= 2000.00) {
			percent = entrada * 0.07;
			percentual = 7;
		} else if (entrada > 2000.00) {
			percent = entrada * 0.04;
			percentual = 4;
		}
		
		System.out.println("Novo salario: " + decimalFormat.format(entrada + percent).replace(",", ".") +
				"\n" + "Reajuste ganho: " + decimalFormat.format(percent).replace(",", ".") +
				"\n" + "Em percentual: " + decimalFormat2.format(percentual) + " %");
	}
}
