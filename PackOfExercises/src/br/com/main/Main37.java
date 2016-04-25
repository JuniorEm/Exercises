package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main37 {
	public static int contador = 0;
	public static String[] array = new String[10];

	public static void adicionaNoArray(String string) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = string;
				break;
			}
		}
	}

	public static int calculaRecursao(int n) {
		if (n < 2)
			return n;
		contador++;
		return calculaRecursao(n - 1) + calculaRecursao(n - 2);
	}

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		int cont = 0;
		int novoValor = 0;
		int resultado = 0;
		int value = Integer.parseInt(br.readLine());

		while (cont < value) {
			contador = 0;
			novoValor = Integer.parseInt(br.readLine());
			resultado = calculaRecursao(novoValor);
			adicionaNoArray("fib(" + novoValor + ")" + " = " + contador * 2 + " calls" + " = " + resultado);
			cont++;
		}

		for (String string : array) {
			if (string != null)
				System.out.println(string);
		}
	}
}
