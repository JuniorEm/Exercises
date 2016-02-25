package br.com.treino.model;

public abstract class Imovel {
	protected String cor;
	Porta[] porta = new Porta[10];

	
	public void pinta(String cor) {
		this.cor = cor;
	}
		
	public abstract int totalDePortas();
	public abstract int quantasPortasEstaoAbertas();
	public abstract void adicionaPorta(Porta porta);
}
