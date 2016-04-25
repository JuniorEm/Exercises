package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main16 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int entrada = Integer.parseInt(br.readLine());
		int entradaCopy = entrada;
		int cont = 0, cedula100 = 0, cedula50 = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0, cedula1 = 0;
		
		while (cont < entrada) {
			if (entradaCopy >= 100) {
				cedula100++;
				cont+=100;
				entradaCopy-=100;
			} else if (entradaCopy >= 50) {
				cedula50++;
				cont+=50;
				entradaCopy-=50;
			} else if (entradaCopy >= 20) {
				cedula20++;
				cont+=20;
				entradaCopy-=20;
			} else if (entradaCopy >= 10) {
				cedula10++;
				cont+=10;
				entradaCopy-=10;
			} else if (entradaCopy >= 5) {
				cedula5++;
				cont+=5;
				entradaCopy-=5;
			} else if (entradaCopy >= 2) {
				cedula2++;
				cont+=2;
				entradaCopy-=2;
			} else if (entradaCopy >= 1) {
				cedula1++;
				cont+=1;
				entradaCopy-=1;
			}
		}
		
		System.out.println(entrada + 
				"\n" + cedula100 + " nota(s) de R$ 100,00" 
				+ "\n" + cedula50 + " nota(s) de R$ 50,00"
				+ "\n" + cedula20 + " nota(s) de R$ 20,00"
				+ "\n" + cedula10 + " nota(s) de R$ 10,00"
				+ "\n" + cedula5 + " nota(s) de R$ 5,00"
				+ "\n" + cedula2 + " nota(s) de R$ 2,00"
				+ "\n" + cedula1 + " nota(s) de R$ 1,00");
		
	}
}
