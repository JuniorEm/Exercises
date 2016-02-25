package br.com.caelum.modelo;

public class NotaDisciplina {
	private float nota;
	private String disciplina;
	
	//Constructor
	public NotaDisciplina(float nota, String disciplina) {
		this.nota = nota;
		this.disciplina = disciplina;
	}

	//Getters and Setters
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return "\nNota: " + getNota() +
				"\nDisciplina: " + getDisciplina();
	}
}
