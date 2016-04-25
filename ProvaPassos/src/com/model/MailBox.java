package com.model;

public class MailBox implements Operacao {
	private Mail[] mailArray = new Mail[10];
	private int quantidadeEmail;

	public MailBox() {}

	public int getTotalEmail() {
		return quantidadeEmail;
	}

	public void guardaEmailRecebido(Mail mail) {
		for (int i = 0; i < mailArray.length; i++)
			if (mailArray[i] == null) {
				mailArray[i] = mail;
				quantidadeEmail++;
				break;
			}
	}

	public Mail[] getEmailComDeterminadoEndereco(String endereco) {
		Mail[] novoArray = new Mail[10];
		int quantidadeEmailEncontrado = 0;

		for (int i = 0; i < this.mailArray.length; i++) {
			if (mailArray[i] != null && mailArray[i].getEnderecoRemetente().equals(endereco)) {
				for (int y = 0; y < novoArray.length; y++) {
					if (novoArray[y] == null) {
						novoArray[y] = mailArray[i];
						quantidadeEmailEncontrado++;
						break;
					}
				}
			}
		}

		if (isEmpty(novoArray))
			System.out.println("A pesquisa não retornou resultados!");
		else
			System.out.println("Quantidade de emails encontrados: " + quantidadeEmailEncontrado + " email(s)");

		return novoArray;
	}

	public Mail[] getEmailRecebido() {
		return mailArray;
	}

	//Lógica para verificar se o array é vazio
	public boolean isEmpty(Mail[] mailArray) {
		int quantidade = 0;

		for (int i = 0; i < mailArray.length; i++) {
			if (mailArray[i] == null)
				quantidade++;
		}

		return quantidade == mailArray.length;
	}

}
