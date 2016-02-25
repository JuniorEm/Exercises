package br.com.projeto.modelo;

public abstract class Imovel {
	protected String cor;
	protected Porta[] portas;
	
	//Constructor
	public Imovel(int size) {
		this.portas = new Porta[size];
	}
	
	//Methods
	public void pinta (String cor) {
		this.cor = cor;
	}
	
	public void adicionaPorta(Porta p) {
		for (int i = 0; i < this.portas.length; i++) {
			if (portas[i] == null) {
				portas[i] = p;
				Porta.cont++;
				Edificio.cont++;
				break;
			}		
		}
	}
	
	public void mostraPorta() {
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] != null) {
				System.out.println(portas[i]);
			}
		}
	}
}
