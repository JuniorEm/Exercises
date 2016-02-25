package br.com.unicamp.modelo;

public class Pluviometro {
	protected String tipo;
	private float peso;
	private float capacidade;
	
	//Constructor
	public Pluviometro(String tipo) {
		this.tipo = tipo;
		
		if (this.tipo.equalsIgnoreCase("Padrão")) {
			peso = (float) 1000.695;
			capacidade = (float) 9000.50;
		} else {
			if (this.tipo.equalsIgnoreCase("Bucket Pluviômetro")) {
				peso = (float) 2000.859;
				capacidade = (float) 15400.75;
			} else {
				if (this.tipo.equalsIgnoreCase("Pluviômetro Óptico")) {
					peso = (float) 3000.323;
					capacidade = (float) 12000.93;
				} else {
					System.out.println("Tipo inválido!");
				}
			}
		}
	}
	
	//Getters and Setters
	public String getTipo() {
		return tipo;
	}
	
	public int getPeso() {
		return (int) peso; //Em Kg
	}
	
	public int getCapacidade() {
		return (int) capacidade; //Em ml
	}
	
	//Methods
	public String toString() {
		return "\nTipo: " + tipo.toUpperCase() +
				"\nPeso: " + peso + " kg " +
				"\nCapacidade: " + capacidade + " ml";
	}
}
