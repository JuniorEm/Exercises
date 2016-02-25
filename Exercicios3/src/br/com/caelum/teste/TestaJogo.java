package br.com.caelum.teste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.modelo.Coisa;
import br.com.caelum.modelo.Papel;
import br.com.caelum.modelo.Pedra;
import br.com.caelum.modelo.Tesoura;

public class TestaJogo {
	public static void main(String[] args) {
		Coisa chama = new Coisa();
		Coisa coisa = new Coisa();
		Coisa coisa1 = new Pedra();
		Coisa coisa2 = new Papel();
		Coisa coisa3 = new Tesoura();
				
		
	chama.confronto(coisa1, coisa3);
		
	}

}
