package br.com.estudomvc.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOFactory {
	
	public String leString() throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		return br.readLine();
	}
	
	public int leInt() throws NumberFormatException, IOException {
		return Integer.parseInt(leString());
	}
}
