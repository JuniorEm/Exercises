package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main35 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.00000");
		String[] array = br.readLine().split(" ");
		double a = Double.parseDouble(array[0]);
		double b = Double.parseDouble(array[1]);
		double c = Double.parseDouble(array[2]);

		double delta = (b * b) - (4 * a * c);

		delta = Math.sqrt(delta);

		double x1 = (-b + delta) / (2 * a);
		double x2 = (-b - delta) / (2 * a);
		
		if (delta > 0 && a != 0) {
			System.out.println("R1 = " + decimalFormat.format(x1).replace(",", ".") + "\nR2 = "
					+ decimalFormat.format(x2).replace(",", "."));
		} else System.out.println("Impossivel calcular");

	}
}
