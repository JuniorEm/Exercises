package br.com.projeto.main;

import br.com.projeto.modelo.Porta;

public class TestaPorta {
	public static void main(String[] args) {
		Porta p = new Porta();
		p.pinta("Vermelha");
		p.setDimensaoX((float) 50.5);
		p.setDimensaoY((float) 20.35);
		p.setDimensaoZ((float) 45.37);
		p.abre();
		p.pinta("Verde");
		
		System.out.println(p);
	}

}
