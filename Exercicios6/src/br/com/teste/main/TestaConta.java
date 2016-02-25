package br.com.teste.main;

import java.math.BigDecimal;
import java.util.List;

import br.com.teste.modelo.Banco;
import br.com.teste.modelo.Conta;
import br.com.teste.modelo.ContaCorrente;
import br.com.teste.modelo.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		ContaCorrente cc = new ContaCorrente(1113, new BigDecimal("3000.00"), new BigDecimal("-5000.00"));
		ContaCorrente cc1 = new ContaCorrente(1122, new BigDecimal("4500.00"), new BigDecimal("-8000.00"));
		ContaCorrente cc2 = new ContaCorrente(1111, new BigDecimal("-7300.00"), new BigDecimal("-10000.00"));
		ContaCorrente cc3 = new ContaCorrente(1116, new BigDecimal("9200.00"), new BigDecimal("-15000.00"));
		ContaCorrente cc4 = new ContaCorrente(1115, new BigDecimal("7600.00"), new BigDecimal("-12000.00"));
		ContaCorrente cc5 = new ContaCorrente(1117, new BigDecimal("8100.00"), new BigDecimal("-16000.00"));
		
		ContaPoupanca cp = new ContaPoupanca(1114, new BigDecimal("7000.00"));
		ContaPoupanca cp1 = new ContaPoupanca(1125, new BigDecimal("4700.00"));
		ContaPoupanca cp2 = new ContaPoupanca(1126, new BigDecimal("8200.00"));
		ContaPoupanca cp3 = new ContaPoupanca(1127, new BigDecimal("3500.00"));
		ContaPoupanca cp4 = new ContaPoupanca(1128, new BigDecimal("2100.00"));
		
		//Exercício 4
		banco.adicionaConta(cc);
		banco.adicionaConta(cc1);
		banco.adicionaConta(cc2);
		banco.adicionaConta(cc3);
		banco.adicionaConta(cc4);
		banco.adicionaConta(cc5);
		banco.adicionaConta(cp);
		banco.adicionaConta(cp1);
		banco.adicionaConta(cp2);
		banco.adicionaConta(cp3);
		banco.adicionaConta(cp4);
		
		/* Exercício 3
		banco.adicionaContaCorrente(cc);
		banco.adicionaContaCorrente(cc1);
		banco.adicionaContaCorrente(cc2);
		banco.adicionaContaCorrente(cc3);
		banco.adicionaContaCorrente(cc4);
		banco.adicionaContaCorrente(cc5);
		
		banco.adicionaContaPoupanca(cp);
		banco.adicionaContaPoupanca(cp1);
		banco.adicionaContaPoupanca(cp2);
		banco.adicionaContaPoupanca(cp3);
		banco.adicionaContaPoupanca(cp4); */
		
		/* Exercício 3
		List<ContaCorrente> novaListaContaCorrente = banco.getContaCorrente();
		List<ContaPoupanca> novaListaContaPoupanca = banco.getContaPoupanca();
		
		
		for (int i = 0; i < novaListaContaCorrente.size(); i++) {
			System.out.println("\nConta Corrente: ");
			System.out.println(novaListaContaCorrente.get(i));
			
			if (novaListaContaCorrente.get(i).getSaldo().compareTo(new BigDecimal("0.0")) < 0) {
				System.out.println("\nA conta " + novaListaContaCorrente.get(i).getNumeroDaConta() + " está no negativo!");
			}
		}
		
		for (int i = 0; i < novaListaContaPoupanca.size(); i++) {
			System.out.println("\nConta Poupança: ");
			novaListaContaPoupanca.get(i).adicionaJuros(new BigDecimal("550.00"));
			System.out.println(novaListaContaPoupanca.get(i));
		} */
		
		List<Conta> novaListaConta = banco.getListaDeConta();
		
		for (Conta c : novaListaConta) {
			if (c instanceof ContaCorrente) {
				System.out.println("\nConta Corrente");
				if (c.getSaldo().compareTo(new BigDecimal("0.0")) < 0) {
					System.out.println("O saldo da conta " +  c.getNumeroDaConta() + " está negativo!");
				}
			} else if (c instanceof ContaPoupanca) {
				System.out.println("\nConta Poupança");
				((ContaPoupanca) c).adicionaJuros(new BigDecimal("550.00"));
			}
			
			System.out.println(c);
		}
		
	}
}
