package br.com.caelum.modelo;

public class Controle {
	private Produto produto; //Agrega��o

	//Constructor
	public Controle() {}
	
	
	//Getters and Setters
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	//Methods
	public String testaProduto(Produto produto) {
		this.produto = produto;
		produto.testaUnidade();
		
		return produto.status;
	}
	
	public String toString() {
		return "\nN�mero de S�rie: " + produto.numeroSerial +
				"\nVolume: " + produto.volume +
				"\nStatus: " + produto.status;
	}
	
	
}
