package br.com.caelum.teste;

import java.math.BigDecimal;

import br.com.caelum.modelo.Conta;
import br.com.caelum.modelo.ContaEspecial;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta("Amarildo José Nunes", "1113", new BigDecimal("1500.5"), new BigDecimal("1800.5"));
		Conta conta2 = new Conta("Daniel Henrique Green", "1114", new BigDecimal("20500.5"), new BigDecimal("39500.75"));
		Conta conta3 = new ContaEspecial("Odair Baitolinha", "1115", new BigDecimal("15750.85"), new BigDecimal("20550.75"));
		conta.deposita(conta2, new BigDecimal("500"));
		
		System.out.println(conta2.getSaldo());
		System.out.println(conta3.getLimite());
	}

}
