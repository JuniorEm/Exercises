package br.com.teste.modelo;

public class Vetor {
	public FormaGeometrica[] forma;
	
	public Vetor(int cont) {
		this.forma = new FormaGeometrica[cont];
	}
	
	public void adiciona(FormaGeometrica formaGeometrica) {
		for (int i = 0; i < this.forma.length; i++) {
			if (this.forma[i] == null) {
				this.forma[i] = formaGeometrica;
				break;
			}
		}
	}
	
	public FormaGeometrica[] getListaForma() {
		return forma;
	}
}
