package br.com.caelum.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Estudante {
	private static final int cont = 5;
	private String nome;
	private int numeroEstudante;
	public List<NotaDisciplina> notas = new ArrayList<>();
	
	//Constructors
	public Estudante(String nome, int numeroEstudante) {
		this.nome = nome;
		this.numeroEstudante = numeroEstudante;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroEstudante() {
		return numeroEstudante;
	}

	public void setNumeroEstudante(int numeroEstudante) {
		this.numeroEstudante = numeroEstudante;
	}


	public static int getCont() {
		return cont;
	}

	//Methods
	public List<NotaDisciplina> adicionaNota(int nota, String disciplina, int ano) {
		NotaDisciplina nd = new NotaDisciplina(nota, disciplina);
			notas.add(nd);

			return notas;
		}
				
	
	public boolean igualNota(Object outroEstudant, String disciplina) {
		Estudante outroEstudante = (Estudante) outroEstudant; //Adicionando o casting no Object "outroEstudant"
		for (int i = 0; i < notas.size(); i++) {
			return notas.get(i).getDisciplina().equals(disciplina) &&  
					(this.notas.get(i).getNota() == outroEstudante.notas.get(i).getNota());
		} //Retorne o array do estudante que invocou o método verificando se a disciplina é aquela passada por parâmetro
		//E compare a nota (array) do estudante atual com o do estudante passado como parâmetro
			return false; //Senão retorne falso
			
	}
	

	
	
}
