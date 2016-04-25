package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main38 {
	public static String[] arrayDeStrings = new String[100];

	public static void adicionaNoArray(String string) {
		for (int i = 0; i < arrayDeStrings.length; i++) {
			if (arrayDeStrings[i] == null) {
				arrayDeStrings[i] = string;
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		int teste = Integer.parseInt(br.readLine());
		int contador = 0;
		int contadorDeLeds = 0;

		while (contador < teste) {
			contadorDeLeds = 0;
			int numero = Integer.parseInt(br.readLine());
			String valor = Integer.toString(numero);
			String[] arrayDeString = valor.split("");
			int[] array = new int[arrayDeString.length];

			for (int i = 0; i < arrayDeString.length; i++) {
				for (int y = 0; y < array.length; y++) {
					if (array[y] == 0 && arrayDeString[i] != null) {
						int novoValor =  Integer.parseInt(arrayDeString[i]);
						System.out.println(novoValor);
						array[y] = novoValor;
						break;
					}
				}
			}

			for (int i = 0; i < array.length; i++) {
				if (array[i] == 1) {
					contadorDeLeds += 2;
				} else if (array[i] == 2) {
					contadorDeLeds += 5;
				} else if (array[i] == 3) {
					contadorDeLeds += 5;
				} else if (array[i] == 4) {
					contadorDeLeds += 4;
				} else if (array[i] == 5) {
					contadorDeLeds += 5;
				} else if (array[i] == 6) {
					contadorDeLeds += 6;
				} else if (array[i] == 7) {
					contadorDeLeds += 3;
				} else if (array[i] == 8) {
					contadorDeLeds += 7;
				} else if (array[i] == 9) {
					contadorDeLeds += 6;
				} else if (array[i] == 0) {
					contadorDeLeds += 6;
				}
			}
			adicionaNoArray(contadorDeLeds + " leds");
			contador++;

		}

		for (String string : arrayDeStrings) {
			if (string != null)
				System.out.println(string);
		}

	}
}
