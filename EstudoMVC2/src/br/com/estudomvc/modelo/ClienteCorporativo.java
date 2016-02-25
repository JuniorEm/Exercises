package br.com.estudomvc.modelo;

import java.util.ArrayList;
import java.util.List;

public class ClienteCorporativo implements Cliente {
	private final int clienteId;
	private String nomeDaEmpresa;
	private int numeroContaPagamento;
	private int pontoDeVoo;
	private String nome;
	private String sobrenome;
	private String estado;
	private String cidade;
	private String rua;
	private String cep;
	private String email;
	private String senha;
	private List<Cliente> listDemo = new ArrayList<>();
	

	//Constructor
	public ClienteCorporativo(int clienteId, String nomeDaEmpresa, int numeroContaPagamento, int pontoDeVoo,
			String nome, String sobrenome, String estado, String cidade, String rua, String cep, String email,
			String senha) {
		this.clienteId = clienteId;
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.numeroContaPagamento = numeroContaPagamento;
		this.pontoDeVoo = pontoDeVoo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.cep = cep;
		this.email = email;
		this.senha = senha;
	}


	public void cadastraCliente(Cliente cliente) {
		listDemo.add(cliente);
	}
}
