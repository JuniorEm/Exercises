package br.com.treino.model;

public class Casa extends Imovel {
	
	
	//Getters and Setters
	public void adicionaPorta(Porta porta) {
		for (int i = 0; i < this.porta.length; i++) {
			if (this.porta[i] == null) {
				this.porta[i] = porta;
				Porta.cont++;
				break;
			}
		}
	}
	
	public int quantasPortasEstaoAbertas() {
		return Porta.cont2;
	}
	
	public int totalDePortas() {
		return Porta.cont;
	}
	
	public String toString() {
		return "\nCor: " + cor +
				"\nNúmero de Portas Abertas: " + this.quantasPortasEstaoAbertas() +
				"\nTotal de Portas: " + this.totalDePortas();
	}
	
	public void pinta(String cor) {
		this.cor = cor;
	}

		
}
