package br.com.treino.model;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	static int cont;
	static int cont2;
	
	//Getters and Setters
	public Porta() {
		Porta.cont++;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	//Methods
	public void abrePorta() {
		aberta = true;
		Porta.cont2++;
	}
	
	public void fechaPorta() {
		aberta = false;
		Porta.cont2--;
	}
	
	public boolean estaAberta() {
		return aberta;
	}
	
	public String toString() {
		return "\nCor: " + this.cor +
				"\nDimensão X: " + this.dimensaoX +
				"\nDimensão Y: " + this.dimensaoY +
				"\nDimensão Z: " + this.dimensaoZ +
				"\nEstá aberta?: " + this.estaAberta();
	}
}
