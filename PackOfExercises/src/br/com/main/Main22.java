package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main22 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0");
		DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
		
		double entrada = Double.parseDouble(br.readLine());
		double entradaCopy = entrada;
		double cont = 0, cedula100 = 0, cedula50 = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0, moeda1 = 0, moeda50 = 0, 
				moeda25 = 0,
				moeda10 = 0, moeda5 = 0, moeda01 = 0;
		
		while (cont < entrada) {
			if (entradaCopy >= 100.0) {
				cedula100++;
				cont+=100;
				entradaCopy-=100.0;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 50) {
				cedula50++;
				cont+=50;
				entradaCopy-=50;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 20) {
				cedula20++;
				cont+=20;
				entradaCopy-=20;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 10) {
				cedula10++;
				cont+=10;
				entradaCopy-=10;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 5) {
				cedula5++;
				cont+=5;
				entradaCopy-=5;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 2) {
				cedula2++;
				cont+=2;
				entradaCopy-=2;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 1) {
				moeda1++;
				cont+=1;
				entradaCopy-=1;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 0.5) {
				moeda50++;
				cont+=0.5;
				entradaCopy-=0.5;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 0.25) {
				moeda25++;
				cont+=0.25;
				entradaCopy-=0.25;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 0.10) {
				moeda10++;
				cont+=0.10;
				entradaCopy-=0.10;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 0.05) {
				moeda5++;
				cont+=0.05;
				entradaCopy-=0.05;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			} else if (entradaCopy >= 0.01) {
				moeda01++;
				cont+=0.01;
				entradaCopy-=0.01;
				entradaCopy = Double.parseDouble(decimalFormat2.format(entradaCopy).replace(",", "."));
				cont = Double.parseDouble(decimalFormat2.format(cont).replace(",", "."));
			}
		}
		
		System.out.println("NOTAS:" +
				"\n" + decimalFormat.format(cedula100) + " nota(s) de R$ 100.00" 
				+ "\n" + decimalFormat.format(cedula50) + " nota(s) de R$ 50.00"
				+ "\n" + decimalFormat.format(cedula20) + " nota(s) de R$ 20.00"
				+ "\n" + decimalFormat.format(cedula10) + " nota(s) de R$ 10.00"
				+ "\n" + decimalFormat.format(cedula5) + " nota(s) de R$ 5.00"
				+ "\n" + decimalFormat.format(cedula2) + " nota(s) de R$ 2.00"
				+ "\nMOEDAS:"
				+ "\n" + decimalFormat.format(moeda1) + " moeda(s) de R$ 1.00"
				+ "\n" + decimalFormat.format(moeda50) + " moeda(s) de R$ 0.50"
				+ "\n" + decimalFormat.format(moeda25) + " moeda(s) de R$ 0.25"
				+ "\n" + decimalFormat.format(moeda10) + " moeda(s) de R$ 0.10"
				+ "\n" + decimalFormat.format(moeda5) + " moeda(s) de R$ 0.05"
				+ "\n" + decimalFormat.format(moeda01) + " moeda(s) de R$ 0.01");
		
	}
}
