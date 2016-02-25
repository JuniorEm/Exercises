package br.com.treino.model;

public class Banco {
	ContaCorrente[] conta = new ContaCorrente[10];
	
	public Banco() {}
	
	public void criaConta(ContaCorrente novaConta) {
		for (int i = 0; i < conta.length; i++) {
			if (conta[i] == null) {
				conta[i] = novaConta;
				break;
			}
		}
	}
	
	public void excluiConta(ContaCorrente contaExclusao) {
		for (int i = 0; i < conta.length; i++) {
			if (conta[i] == contaExclusao) {
				conta[i] = null;
			}
		}
	}
	
	public boolean podeRealizarSaque(ContaCorrente conta, double valor) {
		double valorLimite = conta.getLimite() + conta.getSaldo();
		return (valor <= valorLimite);
	}
	
	public void saca(ContaCorrente conta, double valor) throws Exception { //Quem chamar vai ter que tratar
		if (podeRealizarSaque(conta, valor)) {
			double saldo = conta.getSaldo();
			saldo = saldo - valor;
			conta.setSaldo(saldo);
		} else {
			throw new Exception("Impossível realizar saque!");
		}
	}
	
	public double emiteSaldo(ContaCorrente conta) {
		return conta.getSaldo();
	}
	
	public Movimentacao[] emiteExtrato(ContaCorrente conta) {
		return conta.movimentacao;
	}
	
	public void deposita(ContaCorrente conta, double valor, ContaCorrente outraConta) throws Exception {
		try {
			this.saca(conta, valor);
			double saldo = outraConta.getSaldo();
			saldo = saldo + valor;
			outraConta.setSaldo(saldo);
		} catch (Exception e) {
			throw new Exception("Impossível realizar saque!");
		}
	}
}
