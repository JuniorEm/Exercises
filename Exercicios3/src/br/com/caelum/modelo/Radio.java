package br.com.caelum.modelo;

public class Radio extends Produto {
	private String estacao;
	private String banda;
	
	
	//Constructor
	public Radio(int numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public String getEstacao() {
		return estacao;
	}


	public void setEstacao(String estacao) { //Altera Estação
		this.estacao = estacao;
	}


	public String getBanda() {
		return banda;
	}


	public void setBanda(String banda) { //Altera Banda
		this.banda = banda;
	}
	
	//Methods
	public String escutar() {
		return "\nEstação e Banda: " + estacao +  " " + banda;
	}
	
	public String toString() {
		return "\nNúmero de Série: " + numeroSerial +
				"\nVolume: " + volume +
				"\nStatus: " + status +
				"\nEstação e Banda: " + estacao + " " + banda;
	}

	
	
	
}
