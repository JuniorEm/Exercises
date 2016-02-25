package br.com.treino.view;

import br.com.treino.model.Pais;

public class Main2 {
	public static void main(String[] args) {
		Pais pais1 = new Pais("Brasil", "Brasília", 1500000);
		Pais pais2 = new Pais("Argentina", "Buenos Aires", 4938349);
		Pais pais3 = new Pais("Uruguai", "Monte Video", 93888);
		Pais pais4 = new Pais("Peru", "Lima", 222222);
		Pais pais5 = new Pais("Paraguai", "Assunción", 999999);
		Pais pais6 = new Pais("Bolívia", "La Paz", 120000);
		Pais pais7 = new Pais("Chile", "Santiago", 1500000);
		Pais pais8 = new Pais("Guiana", "Georgetown", 1900000);
		Pais pais9 = new Pais("Venezuela", "Caracas", 1300000);

		pais1.adicionaFronteira(pais2); //Argentina
		pais1.adicionaFronteira(pais3); //Uruguai -
		pais1.adicionaFronteira(pais4); //Peru
		pais1.adicionaFronteira(pais5); //Paraguai -
		pais1.adicionaFronteira(pais6); //Bolívia -
		pais1.adicionaFronteira(pais8); //Guiana
		pais1.adicionaFronteira(pais9); //Venezuela
		
		pais2.adicionaFronteira(pais1); //Brasil
		pais2.adicionaFronteira(pais3); //Uruguai -
		pais2.adicionaFronteira(pais5); //Paraguai -
		pais2.adicionaFronteira(pais6); //Bolívia -
		pais2.adicionaFronteira(pais7); //Chile
		pais2.adicionaFronteira(pais9); //Venezuela



		Pais[] paisFronteira = pais1.fazFronteira(pais2);
				
		for (Pais pais : paisFronteira) {
			if (pais != null) {
				System.out.println(pais);
			}
		}
			


		}
		

	}

