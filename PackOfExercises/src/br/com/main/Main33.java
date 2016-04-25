package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main33 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		int value = Integer.parseInt(br.readLine());
		int resultado = 0;

		for (int i = 1; i <= value; i++) {
			if (i % 2 == 0) {
				resultado = i * i;
				System.out.println(i + "^2 = " + resultado);
			}
		}
	}

}
