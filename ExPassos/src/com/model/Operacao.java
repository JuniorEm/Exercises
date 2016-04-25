package com.model;

import java.util.List;

public interface Operacao {
	
	public void adiciona(Contato contato);
	public void remove(String email);
	public Contato consulta(String email) throws Exception;
	public List<Contato> getLista();
	
}
