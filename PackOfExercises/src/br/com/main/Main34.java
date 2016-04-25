package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main34 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		int value1 = Integer.parseInt(br.readLine());
		int value2 = Integer.parseInt(br.readLine());
		int aux1 = 0;
		int aux2 = 0;
		int somador = 0;

		if (value1 > value2) {
			aux1 = value2;
			aux2 = value1;

			for (int i = value2; i <= value1; i++) {
				if (i % 13 != 0)
					somador = somador + i;
			}
		} else {

			for (int i = value1; i <= value2; i++) {
				if (i % 13 != 0)
					somador = somador + i;
			}
		}
		System.out.println(somador);
	}
}
