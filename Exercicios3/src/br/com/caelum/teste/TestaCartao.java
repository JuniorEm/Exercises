package br.com.caelum.teste;

import java.math.BigDecimal;

import br.com.caelum.modelo.Cartao;
import br.com.caelum.modelo.Conta;

public class TestaCartao {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Daniel Henrique Green", "1114", new BigDecimal("20500.5"), new BigDecimal("39500.75"));
		Cartao cartao1 = new Cartao(conta1, "danidani123");
		
		cartao1.saca(conta1, "danidani123", new BigDecimal("1500.5"));
		System.out.println(conta1.getSaldo());
	}
	
}
