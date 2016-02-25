package br.com.estudomvc.modelo;

import java.util.ArrayList;
import java.util.List;

public class ClienteVarejo {
	private final int clienteId;
	private String tipoCartaoDeCredito;
	private int cartaoDeCreditoNumero;
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
	public ClienteVarejo(int clienteId, String tipoCartaoDeCredito, int cartaoDeCreditoNumero,
			String nome, String sobrenome, String estado, String cidade, String rua, String cep, String email,
			String senha) {
		this.clienteId = clienteId;
		this.tipoCartaoDeCredito = tipoCartaoDeCredito;
		this.cartaoDeCreditoNumero = cartaoDeCreditoNumero;
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
