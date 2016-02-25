package br.com.projeto.main;

import br.com.projeto.modelo.Pais;

public class TestaPais {
	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil", "Brasilia", 1500000);
		Pais p2 = new Pais("Argentina", "Buenos Aires", 85000);
		Pais p3 = new Pais("Peru", "Lima", 65000);
		Pais p4 = new Pais("Bolívia", "Sucre", 1098581);
		Pais p5 = new Pais("Uruguai", "MonteVideo", 500000);
		Pais p6 = new Pais("Chile", "Santiago", 60000);
		Pais p7 = new Pais("Paraguay", "Assunção", 600000);
		
		
		//Brasil
		p1.adicionaFronteira(p2); //Argentina
		p1.adicionaFronteira(p3); //Peru
		p1.adicionaFronteira(p4); //Bolivia
		p1.adicionaFronteira(p7); //Paraguay
		p1.adicionaFronteira(p6); //Chile
		
		//Argentina
		p2.adicionaFronteira(p1); //Brasil
		p2.adicionaFronteira(p4); //Bolívia
		p2.adicionaFronteira(p5); //Uruguay
		p2.adicionaFronteira(p6); //Chile
		p2.adicionaFronteira(p7); //Paraguay
		
		System.out.println(p1.paisesEmComum(p2));

		
		Pais p8 = new Pais("Noruega", "Oslo", 750000);
		
		
	}

}
