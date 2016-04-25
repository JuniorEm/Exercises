package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main3 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat1 = new DecimalFormat("#.0");
		
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c = Double.parseDouble(br.readLine());
		
		double MEDIA = ((a * 2) + (b * 3) + (c * 5)) / 10;
		
		System.out.println("MEDIA = " + decimalFormat1.format(MEDIA).replace(",", "."));
				
	}
}
