package br.com.projeto.modelo;

public class Porta {
	private boolean aberta;
	private String cor;
	private float dimensaoX;
	private float dimensaoY;
	private float dimensaoZ;
	public static int cont;
	public static int cont2;
	
	//Constructors
	public Porta() {
	}
	
	
	//Get & Set
	public boolean isAberta() {
		return aberta;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void pinta(String cor) { //Mesma coisa do que o setCor();
		this.cor = cor;
	}
	
	public float getDimensaoX() {
		return dimensaoX;
	}
	
	public void setDimensaoX(float dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	
	public float getDimensaoY() {
		return dimensaoY;
	}
	
	public void setDimensaoY(float dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	
	public void setDimensaoZ(float dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	//Methods
	public void abre() {
		aberta = true;
		cont2++;
	}
	
	public void fecha() {
		aberta = false;
	}
	

	
	public String toString() {
		return "\n" +
				"\nCor: " + cor +
				"\nDimensão X: " + dimensaoX +
				"\nDimensão Y: " + dimensaoY +
				"\nDimensao Z: " + dimensaoZ +
				"\nEstá aberta?: " +isAberta();
	}
	
}
