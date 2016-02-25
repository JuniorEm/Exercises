package br.com.unicamp.main;

import br.com.unicamp.modelo.Controle;
import br.com.unicamp.modelo.Pluviometro;

public class TesteProgramaCarga {
	public static void main(String[] args) {
		Controle controle = new Controle();
		controle.leString();
		Pluviometro[] novoVetor = Controle.getVetor();
				
	}
}
