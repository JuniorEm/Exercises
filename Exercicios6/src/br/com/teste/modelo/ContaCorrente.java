package br.com.teste.modelo;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
	private final BigDecimal limiteNegativo;
	
	//Constructor
	public ContaCorrente( int numeroDaConta, BigDecimal saldo, BigDecimal limiteNegativo) {
		super(saldo, numeroDaConta);
		this.limiteNegativo = limiteNegativo;
	}

	//Getter
	public BigDecimal getLimiteNegativo() {
		return limiteNegativo;
	}
	
	//Methods
	public void saca(BigDecimal valor) {
		if (valor.compareTo(new BigDecimal("0.0")) > 0 && saldo.subtract(valor).compareTo(limiteNegativo) > 0) { //Se valor for maior do que o limite negativo se 
			saldo = saldo.subtract(valor);
		} else {
			System.err.println("Não é possível realizar o saque!");
		}
	}
	
}
