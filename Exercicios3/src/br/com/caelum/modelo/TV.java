package br.com.caelum.modelo;

public class TV extends Produto {
	private int canal;
	
	//Constructor
	public TV(int numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) { //Troca o Canal
		this.canal = canal;
	}
	
	public String toString() {
		return "\nNúmero de Série: " + numeroSerial +
				"\nVolume: " + volume +
				"\nStatus: " + status +
				"\nCanal: " + canal;
	}
	
	
	
	
	
	
}
