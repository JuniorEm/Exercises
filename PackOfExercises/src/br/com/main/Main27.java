package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main27 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimal = new DecimalFormat("R$ 0.00");
		
		double entrada = Double.parseDouble(br.readLine());
		
		if (entrada >= 0 && entrada <= 25)
			System.out.println("Intervalo [0,25]");
		else if(entrada >= 25 && entrada <= 50)
			System.out.println("Intervalo (25,50]");
		else if(entrada >= 50 && entrada <= 75)
			System.out.println("Intervalo (50,75]");
		else if(entrada >= 75 && entrada <= 100)
			System.out.println("Intervalo (75,100]");
		else
			System.out.println("Fora de intervalo");
	}
}
