package br.com.estudomvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InterfaceCliente2 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("\n-----------------------------------------------------------------");
		System.out.println("Nome da Empresa: --------------------------------------------------");
		String empresa = br.readLine();
		System.out.println("N�mero Conta De Pagamento: ----------------------------------------");
		int numero = Integer.parseInt(br.readLine());
		System.out.println("Ponto de V�o: -------------------------------------------");
		String ponto = br.readLine();
	}
}
