package br.com.exercicio.teste;

import br.com.exercicio.modelo.ItemOrcamento;
import br.com.exercicio.modelo.ItemOrcamentoComplexo;

public class TestaItem {
	public static void main(String[] args) {
		ItemOrcamento io = new ItemOrcamento("Geladeira", (float) (3000.85));
		ItemOrcamento io2 = new ItemOrcamento("Ferro De Passar", (float) (300.85));
		ItemOrcamento[] lista = io.getItem();
		
		ItemOrcamentoComplexo i = new ItemOrcamentoComplexo("Celular", (float) 900.25, lista);
		ItemOrcamentoComplexo i1 = new ItemOrcamentoComplexo("Cama", (float) 1000.50, lista);
		io.adiciona(io);
		io.adiciona(io2);
		io.adiciona(i);
		io.adiciona(i1);
		//System.out.println(i.getItem("ferro de passar"));
		System.out.println(i.getItem("geladEira"));
	}
}

