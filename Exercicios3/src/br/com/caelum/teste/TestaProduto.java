package br.com.caelum.teste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.caelum.modelo.Produto;

public class TestaProduto {
	public static void main(String[] args) {
		Produto pr = new Produto(123412132);
		pr.testaUnidade();
		System.out.println(pr);
	}
}
