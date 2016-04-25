package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main2 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat1 = new DecimalFormat("0.0");
		DecimalFormat decimalFormat2 = new DecimalFormat("0.00000");
		double MEDIA, a, b;
		MEDIA = 0;
		a = Double.parseDouble(br.readLine());
		b = Double.parseDouble(br.readLine());
		
		if ((a <= 10) && (b <= 10))
			MEDIA = ((a * 3.5) + (b * 7.5)) / 11;

		System.out.printf("MEDIA = " + decimalFormat2.format(MEDIA).replace(",", "."));
		
	}
}
