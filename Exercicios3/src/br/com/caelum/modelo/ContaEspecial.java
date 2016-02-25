package br.com.caelum.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta{

	public ContaEspecial(String nomeDoCliente, String numeroDaConta, BigDecimal saldo, BigDecimal limite) {
		super(nomeDoCliente, numeroDaConta, saldo, limite.multiply(new BigDecimal("3.0")));
		// TODO Auto-generated constructor stub
	}
	
	

}
