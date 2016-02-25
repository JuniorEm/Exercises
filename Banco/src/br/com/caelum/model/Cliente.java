package br.com.caelum.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Cliente {
	private String nome;
	private Calendar dataDeNascimento;
	private String rg;
	private String cpf;
	private Conta conta;
	
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	//Constructor
	public Cliente(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public Cliente(String nome, Calendar dataDeNascimento, String rg, String cpf, Conta conta) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}
		
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	//Methods
	public String toString() {
		return "\nNome: " + getNome() +
				"\nData de Nascimento: " + format.format(getDataDeNascimento().getTime()) + //Método format de SimpleDateFormat recebe um Date em seu construtor
				"\nRG: " + getRg() +
				"\nCPF: " + getCpf() +
				"\nNúmero da Conta: " + conta.getNumeroDaConta() +
				"\nSaldo da Conta: " + NumberFormat.getCurrencyInstance().format(conta.getSaldo());
	}
	
	

}
