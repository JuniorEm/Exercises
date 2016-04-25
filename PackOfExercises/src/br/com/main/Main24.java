package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main24 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int entrada = Integer.parseInt(br.readLine());
		
		if(entrada >=2 && entrada <= 1000)
			for (int i = 1; i <= 10; i++)
				System.out.println(i + " x " + entrada + " = " + (entrada * i));
	}
}
