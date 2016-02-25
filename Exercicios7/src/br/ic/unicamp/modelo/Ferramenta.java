package br.ic.unicamp.modelo;

public interface Ferramenta {
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);
	public String[] classificaEspecie(Animal[] completo);
}
