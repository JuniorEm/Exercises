package br.com.projeto.main;

import br.com.projeto.modelo.Edificio;
import br.com.projeto.modelo.Porta;

public class TestaEdificio {
	public static void main(String[] args) {
		Edificio e = new Edificio(10);
		Edificio e1 = new Edificio(40);
		e.pinta("Roxo");
		
		Porta p1 = new Porta();
		p1.pinta("Cinza");
		p1.setDimensaoX((float) 63.5);
		p1.setDimensaoY((float) 60.34);
		p1.setDimensaoZ((float) 80.32);
		p1.abre();
		
		Porta p2 = new Porta();
		p2.pinta("Cinza");
		p2.setDimensaoX((float) 25.5);
		p2.setDimensaoY((float) 55.34);
		p2.setDimensaoZ((float) 81.32);
		p2.abre();
		
		Porta p3 = new Porta();
		p3.pinta("Preta");
		p3.setDimensaoX((float) 54.5);
		p3.setDimensaoY((float) 85.34);
		p3.setDimensaoZ((float) 14.32);
		p3.abre();
		
		Porta p4 = new Porta();
		
		
		e.adicionaPorta(p1);
		e.adicionaPorta(p2);
		e.adicionaPorta(p3);
		e.adicionaPorta(p4);
		
		e.adicionaAndar();
		e.adicionaAndar();
		e.adicionaAndar();
		e.adicionaAndar();
		e.adicionaAndar();
		e.adicionaAndar();
		e.adicionaAndar();
		System.out.println(e);
	}
}
