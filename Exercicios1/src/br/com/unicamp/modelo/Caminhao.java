package br.com.unicamp.modelo;

public class Caminhao {
	protected String tipo;
	protected Pluviometro[] pluviometro;
	
	//Constructors
	public Caminhao(String tipo) {
		this.tipo = tipo;
	}
	
	public Caminhao(int quantidade, String tipo) {
		this.tipo = tipo;
	}
	
	//Methods
	public void inserePluviometro(Pluviometro pluviometro) {};
	
	public String toString() {
		return "Tipo do caminhão: " + tipo.toUpperCase();
	}
	
	public Pluviometro[] getCarregamento() {
		return pluviometro;
	}
}
