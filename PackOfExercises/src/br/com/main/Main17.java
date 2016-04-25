package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main17 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int entrada = Integer.parseInt(br.readLine());
		int cont = 0, hh = 00, mm = 00, ss = 00;
		
		while (cont < entrada) {
			if (ss < entrada) {
				ss++;
			}
			
			if (ss > 59) {
				mm++;
				ss = 0;
			}
			
			if (mm > 59) {
				hh++;
				mm = 0;
			}
			
			cont++;
				
		}
		
		System.out.println(hh + ":" + mm + ":" + ss);
		
		
	}
}
