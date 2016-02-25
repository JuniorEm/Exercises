package br.com.treino.view;

import br.com.treino.model.Banco;
import br.com.treino.model.ContaCorrente;
import br.com.treino.model.Movimentacao;

public class Main {
	public static void main(String[] args) {
		Banco bancoPrincipal = new Banco();
		Movimentacao movimentacao1 = new Movimentacao("Restaurante Arcos Dourados McDonald's ltda.", 35.80, "Crédito");
		Movimentacao movimentacao2 = new Movimentacao("Marisa Roupas e Lingeries", 150.00, "Débito");
		Movimentacao movimentacao3 = new Movimentacao("PBKids Brinquedos", 298.50, "Crédito");
		Movimentacao movimentacao4 = new Movimentacao("Cinemark", 25.00, "Crédito");
		Movimentacao movimentacao5 = new Movimentacao("Burger King", 155.00, "Crédito");

		
		ContaCorrente conta1 = new ContaCorrente("14601", 5000, 6000);
		conta1.adicionaMovimentacao(movimentacao1);
		conta1.adicionaMovimentacao(movimentacao2);
		conta1.adicionaMovimentacao(movimentacao3);
		conta1.adicionaMovimentacao(movimentacao4);
		conta1.adicionaMovimentacao(movimentacao5);
		ContaCorrente conta2 = new ContaCorrente("14602", 10000, 7000);
		bancoPrincipal.criaConta(conta1);
		bancoPrincipal.criaConta(conta2);
		

		try {
			double valor = conta1.getSaldo();
			bancoPrincipal.deposita(conta1, 1500, conta2);
			System.out.println(bancoPrincipal.emiteSaldo(conta1));
			
			Movimentacao[] arrayDeMovimentacao = bancoPrincipal.emiteExtrato(conta1);
			for (Movimentacao novoArray : arrayDeMovimentacao) {
				if (novoArray != null) {
					System.out.println(novoArray);
				}
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Impossível realizar movimentação!", e);
		}
		

		
		
	}
}
