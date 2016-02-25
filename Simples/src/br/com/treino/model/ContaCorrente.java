package br.com.treino.model;

public class ContaCorrente {
	private String numero;
	private double saldo;
	private double limite;
	Movimentacao[] movimentacao = new Movimentacao[10];
	
	public ContaCorrente(String numero, double saldo, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	//Getters and Setters
	public String getNumero() {
		return numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}


	public double getLimite() {
		return limite;
	}
	
		
	//Method
	public void adicionaMovimentacao(Movimentacao novaMovimentacao) {
		if (podeMovimentar()) {
			for (int i = 0; i < movimentacao.length; i++) {
				if (movimentacao[i] == null) {
					movimentacao[i] = novaMovimentacao;
					saldo = saldo - movimentacao[i].getValor();
					break;
				}
			}
		}
	}

	private boolean podeMovimentar() {
		return saldo > 0;
	}
	

	
}
