package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main18 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int entrada = Integer.parseInt(br.readLine());
		int cont = 0, yy = 0, mm = 0, dd = 0;
	
		while (cont < entrada) {
			if (dd < entrada) {
				dd++;
			}
			
			if (dd == 30) {
				mm++;
				dd = 0;
			}
			
			if (mm == 12) {
				yy++;
				mm = 0;
				dd = -5;
			}
			
			cont++;
		}
		
		
		System.out.println(yy + " ano(s)" +
				"\n" + mm + " mes(es)" +
				"\n" + dd + " dia(s)");
		
	}
}
