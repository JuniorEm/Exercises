package com.model;

import java.text.DecimalFormat;

public class Imposto implements Aliquotas {
	private double value;
	DecimalFormat format = new DecimalFormat("R$ #####.##");
	
	public Imposto(double value) {
		this.value = value;
	}
	
	public double calculaCofins() {
		return value * COFINS;
	}
	
	public double calculaPis() {
		return value * PIS_FATURAMENTO;
	}
	
	public double somaFaturamento() {
		return calculaCofins() + calculaPis();
	}
	
	public String info() {
		return "\nFaturamento: " + format.format(value) +
				"\nCOFINS: " + format.format(calculaCofins()) +
				"\nPIS: " + format.format(calculaPis()) +
				"\nSoma do Faturamento: " + format.format(somaFaturamento());
	}
}
