package br.com.estudomvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InterfaceCliente1 implements Interface {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("\n-----------------------------------------------------------------");
		System.out.println("Tipo Cart�o de Cr�dito: -------------------------------------------");
		String tipo = br.readLine();
		System.out.println("N�mero Cart�o de Cr�dito: -------------------------------------------");
		int numero = Integer.parseInt(br.readLine());
		
	}
}
