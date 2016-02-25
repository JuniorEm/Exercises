package br.com.estudomvc.modelo;

import java.text.DecimalFormat;

public class Divisao implements Calculo {


	
	public double getCalculo(double x, double y) {
		DecimalFormat df = new DecimalFormat("#.###");
		double oldValue = x / y;
		String i = df.format(oldValue).replace(",", ".");
		Double z = new Double("0.0");
		double
		a = z.valueOf(i);
		
		return a;
	}

}
