package com.model;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList implements Operacao {
	private List<Contato> lista = new ArrayList<>();
	
	public void adiciona(Contato contato) {
		lista.add(contato);
	}
	
	public void remove(String email) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getEmail().equals(email))
				lista.remove(i);
		}
	}
	
	public Contato consulta(String email) throws Exception {
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i).getEmail().equals(email))
				return lista.get(i);
		throw new Exception("O contato não foi encontrado");
	}
	
	public List<Contato> getLista() {
		return lista;
	}
}
