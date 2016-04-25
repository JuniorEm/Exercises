package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main10 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.000 km/l");
		
		int x = Integer.parseInt(br.readLine());
		double y = Double.parseDouble(br.readLine());
		
		System.out.println(decimalFormat.format(x / y).replace(",", "."));
	}
}
