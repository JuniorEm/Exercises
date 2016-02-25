package br.com.exercicio.modelo;

public interface Ferramenta {
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);
	public String[] classificaEspecie(Animal[] completo);
}
