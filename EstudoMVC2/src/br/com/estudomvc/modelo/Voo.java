package br.com.estudomvc.modelo;

import java.util.Date;

public class Voo {
	private final int vooId;
	private final Date dataDeVoo;
	private final String origem;
	private final String destino;
	
	public Voo(int vooId, Date dataDeVoo, String origem, String destino) {
		this.vooId = vooId;
		this.dataDeVoo = dataDeVoo;
		this.origem = origem;
		this.destino = destino;
	}

	//Getters
	public int getVooId() {
		return vooId;
	}

	public Date getDataDeVoo() {
		return dataDeVoo;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}
	
	//Methods
	
	
}
