package br.com.treino.model;

public class Edificio extends Imovel {
	private String cor;
	private int totalDePortas;
	private int totalDeAndares;
	
	
	//Methods
	public void adicionaPorta(Porta porta) {
		for (int i = 0; i < this.porta.length; i++) {
			if (this.porta[i] == null) {
				this.porta[i] = porta;
				totalDePortas++;
				break;
			}
		}
	}
	
	public void adicionaAndar() {
		for (int i = 1; i < 22; i++) {
			totalDeAndares++;
			break;
		}
	}
	
	public int quantasPortasEstaoAbertas() {
		return Porta.cont2;
	}
	
	public int totalDePortas() {
		return totalDePortas;
	}
	
	public int totalDeAndares() {
		return totalDeAndares;
	}
	
	public String toString() {
		return "\nCor: " + this.cor +
				"\nNúmero de Portas Abertas: " + this.quantasPortasEstaoAbertas() +
				"\nTotal de Portas: " + this.totalDePortas() +
				"\nTotal de Andares: " + this.totalDeAndares();
	}
	
	
	
}
