package br.com.projeto.modelo;


public class ContaCorrente {
	private int numero;
	private float saldo;
	private float limite;
	
	//Constructors
	public ContaCorrente() {}
	
	
	//Get & Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	//Methods
	public boolean ehEspecial() {
		return saldo > 0;
	}
	
	public String movimenta(String descricao, float valor, String movimentacao) {
		saldo = saldo - valor;
		return "\nNúmero da Conta: " + this.getNumero() +
				"\nDescrição: " + descricao +
				"\nValor: " + valor +
				"\nMovimentação: " +movimentacao;
	}

	
	
	
}
