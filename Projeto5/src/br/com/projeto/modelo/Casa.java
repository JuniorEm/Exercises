package br.com.projeto.modelo;

public class Casa extends Imovel {
	Porta[] portas;
	
	//Constructor
	public Casa (int size) {
		super(size);
	}
	
	
	//Methods
	
	public int quantasPortasEstaoAbertas() {
		return Porta.cont2;
	}
	
	public int totalDePortas() {
		return Porta.cont;
	}
	
	public String toString() {
		return "\n" +
				"\nNúmero de Portas que tem na casa: " + totalDePortas() +
				"\nNúmero de Portas abertas na casa: " +quantasPortasEstaoAbertas();
	}
	
	
	
}
