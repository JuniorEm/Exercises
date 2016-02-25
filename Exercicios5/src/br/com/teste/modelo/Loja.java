package br.com.teste.modelo;

import java.util.Arrays;

public class Loja {
	Produto[] produto = new Produto[5];

	public void adiciona(Produto produtoz, Produto produtoy, Produto produtow, Produto produtoa, Produto produtob) {
		for (int i = 0; i < produto.length; i++) {
			if (produto[i] == null) {
				produto[i] = produtoz;
				produto[i+1] = produtoy;
				produto[i+2] = produtow;
				produto[i+3] = produtoa;
				produto[i+4] = produtob;
				break;
			}
		}
	}
	
	public Produto[] getLista() {
		return produto;
	}
	
	public Produto getProduto(Produto produto) {
		for (int i = 0; i < this.produto.length; i++) {
				if (this.produto[i].equals(produto)) {
					System.out.println("\nPosição do Produto: " + i);
					return this.produto[i];
				}
					
		}
			return null;
			
	}
}
