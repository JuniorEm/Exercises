package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main8 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat1 = new DecimalFormat("0.000");
		
		int value = Integer.parseInt(br.readLine());
		
		System.out.println("VOLUME = " + decimalFormat1.format( (4.0/3) * 3.14159 * value * value * value).replace(",", "."));
	}
}
