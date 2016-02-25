package br.com.teste.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaCorrente {
	protected BigDecimal saldo;
	protected double saldo2;
	//Constructors
	public ContaCorrente(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	//Getters
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	//Methods
	public void saca(BigDecimal valor) {
		saldo = saldo.subtract(new BigDecimal("0.5").divide(new BigDecimal(100)).multiply(valor)).subtract(valor);
	}
	
	public void sacaComDouble(double valor) {
		saldo2 = 2000.5;
		double op = saldo2 - (0.5/100 * valor) - valor;
		System.out.println("" + op);
	}
	
	public void deposita(ContaCorrente outraContaCorrente, BigDecimal valor) {
		this.saca(valor);
		outraContaCorrente.saldo = outraContaCorrente.saldo.add(valor);
	}

	
	
}
