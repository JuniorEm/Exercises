package br.com.teste.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	//Constructor
	public ContaCorrenteEspecial(BigDecimal saldo) {
		super(saldo);
	}
	
	//Methods
	public void saca(BigDecimal valor) {
		saldo = saldo.subtract(new BigDecimal("0.1").divide(new BigDecimal(100)).multiply(valor)).subtract(valor);
	}
}
