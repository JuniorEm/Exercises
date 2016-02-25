package br.com.teste.modelo;

import java.math.BigDecimal;

public class Produto implements Comparable {
	protected String nome;
	protected BigDecimal preco;
	protected final int codigoDeBarras;
	
	//Constructor
	public Produto(String nome, BigDecimal preco, int codigoDeBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codigoDeBarras = codigoDeBarras;
	}
	
	//Getter and Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public long getCodigoDeBarras() {
		return codigoDeBarras;
	}

	//Methods
	public String toString() {
		return "Nome: " + nome + "\t" + "Preço: " + preco + "\tCódigo de Barras: " + codigoDeBarras;
	}
	
	public boolean equals(Object outroProduto) {
		Produto otherProduct = (Produto) outroProduto;
		return new Integer(this.codigoDeBarras).equals(new Integer(otherProduct.codigoDeBarras)); //AUTOBOXING
	}


	/*public int compareTo(Object o) {
		Produto outroProduto = (Produto) o; //Casting em Object
		return this.preco.compareTo(outroProduto.preco); //Automaticamente o compareTo já sabe lidar com Strings, não precisamos
		//reinventar a roda
	}*/
	
	public int compareTo(Object o) { //Colocando por ordem de preço
	Produto outroProduto = (Produto) o; //Casting em Object
	
	if (this.preco.doubleValue() < outroProduto.preco.doubleValue()) {
		return -1;
	}
	
	if (this.preco.doubleValue() > outroProduto.preco.doubleValue()) {
		return 1;
	}
		return 0;

}
	

	

}
