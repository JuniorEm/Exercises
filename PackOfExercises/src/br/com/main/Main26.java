package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main26 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimal = new DecimalFormat("R$ 0.00");
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		int codigo = Integer.parseInt(vetor[0]);
		int quantidade = Integer.parseInt(vetor[1]);
		
		double valor = 0.0;
		
		if (codigo == 1)
			 valor = 4.00;
		else if (codigo == 2)
			valor = 4.50;
		else if (codigo == 3)
			valor = 5.00;
		else if (codigo == 4)
			valor = 2.00;
		else if (codigo == 5)
			valor = 1.50;
		
		System.out.println("Total: " + decimal.format((valor * quantidade)).replace(",", "."));
	}
}
