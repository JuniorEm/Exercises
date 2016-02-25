package br.com.projeto.main;

import br.com.projeto.modelo.Casa;
import br.com.projeto.modelo.Porta;

public class TestaCasa {
	public static void main(String[] args) {
		Casa casa = new Casa(5);
		
		Porta porta1 = new Porta();
		porta1.pinta("Lilás");
		porta1.setDimensaoX((float) 45.55);
		porta1.setDimensaoY((float) 30.5);
		porta1.setDimensaoZ((float) 20.5);
		casa.adicionaPorta(porta1);
		porta1.abre();
		
		Porta porta2 = new Porta();
		porta2.pinta("Verde");
		porta2.setDimensaoX((float) 30.5);
		porta2.setDimensaoY((float) 40.65);
		porta2.setDimensaoZ((float) 50.5);
		casa.adicionaPorta(porta2);
		porta2.abre();
		

		Porta porta3 = new Porta();
		porta3.pinta("Azul");
		porta3.setDimensaoX((float) 70.5);
		porta3.setDimensaoY((float) 30.5);
		porta3.setDimensaoZ((float) 20.5);
		casa.adicionaPorta(porta3);
		porta3.fecha();
		
		
		casa.mostraPorta();
		System.out.println(casa);

		
	}

}
