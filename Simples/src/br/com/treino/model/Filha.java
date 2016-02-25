package br.com.treino.model;


public class Filha extends Pai {
	private String nomeFilha;
	
	public Filha(String nomeFilha, String nomePai) {
		super(nomePai);
		this.nomeFilha = nomeFilha;
	}

	public String getNome() {
		return "oi" + this.getNome();
	}
}
