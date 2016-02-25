package br.com.exercicio.teste;

import java.math.BigDecimal;

import br.com.exercicio.modelo.Banco;
import br.com.exercicio.modelo.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco1 = new Banco("Itaú", 6512);
		Banco banco2 = new Banco("Bradesco", 1545);
		
		Conta conta1 = new Conta("Teste1", 1113, new BigDecimal("15600.6"));
		conta1.setBanco(banco1);
		
		Conta conta2 = new Conta("Teste2", 1114, new BigDecimal("19900.75"));
		
		
		System.out.println(banco1.adicionaConta(conta1));
		
		System.out.println(banco2.adicionaConta(conta2));
	}

}
