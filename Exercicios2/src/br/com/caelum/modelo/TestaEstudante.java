package br.com.caelum.modelo;

public class TestaEstudante {
	public static void main(String[] args) {
		Estudante est = new Estudante("Carlos", 1);
		System.out.println(est.adicionaNota(5, "Matemática", 0));
		
		Estudante est2 = new Estudante("José", 2);
		System.out.println(est2.adicionaNota(6, "Matemática", 1));
		
		System.out.println(est.igualNota(est2, "Matemática"));
		
	}
}
