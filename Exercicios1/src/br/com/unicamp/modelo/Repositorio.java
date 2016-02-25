package br.com.unicamp.modelo;

public interface Repositorio {
	public void guarda(Pessoa pessoa);
	public Pessoa recupera(String cpf);
	public Pessoa primeiro();
	public Pessoa proximo();
	public Pessoa[] getVetor();
	public void remove(Pessoa pessoa);
}
