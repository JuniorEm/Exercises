package com.model;

public enum Gravidade {
	MINIMA(1), MEDIA(2), ALTA(3);
	
	private final int idGravidade;
	
	Gravidade(int idGravidade) {
		this.idGravidade = idGravidade;
	}
	
	public int getTipo() {
		return idGravidade;
	}
}
