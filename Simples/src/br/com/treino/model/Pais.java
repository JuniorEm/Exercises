package br.com.treino.model;

public class Pais {
	private final String nome;
	private final String capital;
	private final double dimensao;
	private Pais[] paisesFronteira = new Pais[10];
	
	public Pais(String nome, String capital, double dimensao) {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}

	
	public String getNome() {
		return nome;
	}

	public String getCapital() {
		return capital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public Pais[] getPaisesFronteira() {
		return paisesFronteira;
	}
	
	public boolean equals(final Pais outro) {
		return ((this.nome == outro.nome) && (this.capital == outro.capital));
	}
	
	public void adicionaFronteira(Pais pais) {
		for (int i = 0; i < this.paisesFronteira.length; i++) {
			if ( (this.paisesFronteira[i] == null) && !(this.equals(pais)) ) {
				this.paisesFronteira[i] = pais;
				break;
			}
		}
	}
	
	public Pais[] fazFronteira(Pais outroPais) {
		Pais[] paisEmComum = new Pais[10];

		for (int i = 0; i < this.paisesFronteira.length; i++) { //Pega o primeiro e compara com todos os 
			//elementos do array abaixo
			for (int y = 0; y < outroPais.paisesFronteira.length; y++) {
					if ((this.paisesFronteira[i] != null) && (outroPais.paisesFronteira[y] != null)
							&& (this.paisesFronteira[i] == outroPais.paisesFronteira[y])) {
						paisEmComum[i] = outroPais.paisesFronteira[y];
						break;
					}

			}
		}
		return paisEmComum;
	}
	
	public String toString() {
		return "\nNome: " + this.nome +
				"\nCapital: " + this.capital +
				"\nDimensão: " + this.dimensao;
	}
	
	
}
