package br.com.treino.view;

import br.com.treino.model.Edificio;
import br.com.treino.model.Imovel;
import br.com.treino.model.Porta;

public class Main3 {
	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.abrePorta();
		porta.fechaPorta();
		porta.abrePorta();
		porta.setCor("Vermelha");
		porta.setDimensaoX(60);
		porta.setDimensaoY(30);
		porta.setDimensaoZ(40);
		
		Porta porta2 = new Porta();
		porta2.abrePorta();
		porta2.fechaPorta();
		porta2.setCor("Azul");
		porta2.setDimensaoX(60);
		porta2.setDimensaoY(30);
		porta2.setDimensaoZ(40);
		
		Porta porta3 = new Porta();
		porta3.abrePorta();
		porta3.fechaPorta();
		porta3.setCor("Amarela");
		porta3.setDimensaoX(60);
		porta3.setDimensaoY(30);
		porta3.setDimensaoZ(40);
		
		Porta porta4= new Porta();
		porta4.abrePorta();
		porta4.fechaPorta();
		porta4.abrePorta();
		porta4.setCor("Azul");
		porta4.setDimensaoX(60);
		porta4.setDimensaoY(30);
		porta4.setDimensaoZ(40);
		
		Edificio edificio = new Edificio(); //Não pode ser type generic se for adicionar
		edificio.pinta("Cinza");
		edificio.adicionaAndar();
		edificio.adicionaAndar();
		edificio.adicionaAndar();
		edificio.adicionaAndar();
		edificio.adicionaAndar();
		edificio.adicionaPorta(porta);
		edificio.adicionaPorta(porta2);
		edificio.adicionaPorta(porta3);
		edificio.adicionaPorta(porta4);
		System.out.println(edificio);
		
		
	}
}
