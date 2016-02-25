package br.com.caelum.teste;

import br.com.caelum.modelo.Produto;
import br.com.caelum.modelo.Radio;

public class TestaRadio {
	public static void main(String[] args) {
		Radio radio = new Radio(11783);
		radio.setVolume(50);
		radio.setEstacao("93.7");
		radio.setBanda("FM");
		radio.testaUnidade();
		System.out.println(radio);
		
		Produto produto = new Produto(11543);
		produto.setVolume(10);
		produto.testaUnidade();
		System.out.println(produto);
	}

}
