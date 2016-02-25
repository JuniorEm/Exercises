package br.com.caelum.teste;

import java.io.PrintStream;

public class TesteString {
	public static void main(String[] args) {
		/*
		StringBuffer sb = new StringBuffer("Monique");
		sb.reverse();
		System.out.println(sb);
		
		int i = 100;
		double f = 5.0;
		String s = sb+", você é " + i + " e " + f;
		System.out.println("\n"+s);
		
		String a = "101";
		String b = "150";
		int j = Integer.parseInt(a);
		int g = Integer.parseInt(b);
		System.out.println(j+g);*/
		/*
		Object o = 5; //Vale lembrar que isso não quer dizer que tipos primitivos e referências sejam do mesmo tipo
		int y = (int) o;
		
		System.out.println(y);
		
		String str = new String("Monique e Junior");
		System.out.println(str.replace("o", "a")); 
		
		String s = new String ("Zabumba");
		String y = new String ("ReiDoGado");
		
		
		int x = Integer.parseInt(s);
		int z = Integer.parseInt(y);
		
		
		System.out.println(x+z); 
		
		PrintStream saida = System.out;
		saida.print(1.500 + 2.500); */
		
		
		char c = '7';
		char d = '6';
		char e = '2';
		int x = Character.getNumericValue(c);
		int y= Character.getNumericValue(d);
		int z = Character.getNumericValue(e);
		
		System.out.println(x+""+y+""+z);
		
		
		
		
		
	}
	


}
