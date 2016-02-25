package br.com.inter.main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TesteMain2 {
	public static void main(String[] args) {
		String mascara = "####-####";
		String numero = "39067433";
		String newMask = null;
		
		
		
		
		for (int i = 0; i < mascara.length(); i++) {
			String nova = numero.substring(i, i+1);
			System.out.println(mascara.replace("#", nova));
		}
	}
}
