package br.cefetpi.entity;

import java.util.List;

public interface ClienteDAO {
	
	public void save(Cliente entity);
	
	public void delete(Cliente entity);
	
	public Cliente findById(int id);
	
	List find();
	
	Cliente findByCpf(String cpf);
	
	List findByName(String nome);

}
