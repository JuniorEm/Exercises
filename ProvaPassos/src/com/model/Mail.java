package com.model;

public class Mail {
	private final String enderecoRemetente;
	private final String dataEnvio;
	private final String dataRecepcao;
	private final String assunto;
	private final String corpo;

	public Mail(String enderecoRemetente, String dataEnvio, String dataRecepcao, String assunto, String corpo) {
		this.enderecoRemetente = enderecoRemetente;
		this.dataEnvio = dataEnvio;
		this.dataRecepcao = dataRecepcao;
		this.assunto = assunto;
		this.corpo = corpo;
	}

	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public String getDataRecepcao() {
		return dataRecepcao;
	}

	public String getAssunto() {
		return assunto;
	}

	public String getCorpo() {
		return corpo;
	}

	public String toString() {
		return "\nEndereço do remetente: " + enderecoRemetente + "\nData de envio: " + dataEnvio
				+ "\nData de recepção: " + dataRecepcao + "\nAssunto: " + assunto + "\nTexto Corpo do Email: " + corpo;
	}

}
