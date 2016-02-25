package br.com.caelum.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produto {
	protected int numeroSerial;
	protected int volume;
	protected String status = "Não testado";
	
	//Constructor
	public Produto(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	
	
	//Getters and Setters
	public int getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) { //Isso já é o Altera Volume
		this.volume = volume;
	}

	public String getStatus() {
		return status;
	}

	
	//Methods
	public boolean testaUnidade() {
		BigDecimal numero = new BigDecimal(Math.random());
		BigDecimal numero2 = numero.divide(new BigDecimal("1.0"), 1, RoundingMode.UP);
		//System.out.println(numero.divide(new BigDecimal("1.0"), 1, RoundingMode.UP)); //Arrendondamento
		if (numero2.compareTo(new BigDecimal("0.9")) == 0 || numero2.compareTo(new BigDecimal("0.8")) == 0) {
			this.status = "Aprovado!";
			return true;
		} else {
			this.status = "Reprovado!";
			return false;
		}

	}
	
	public String toString() {
		return "\nNúmero de Série: " + numeroSerial +
				"\nVolume: " + volume +
				"\nStatus: " + status;
	}
	

		
	}
	
