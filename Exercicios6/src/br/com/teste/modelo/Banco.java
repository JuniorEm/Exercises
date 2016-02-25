package br.com.teste.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	/*Exercício 3
	List <ContaCorrente> contaCorrente = new ArrayList<>();
	List<ContaPoupanca> contaPoupanca = new ArrayList<> (); */
	
	//Exercício 4
	List<Conta> conta = new ArrayList<>();
	
	//Constructor
	public Banco () {}
	
	//Methods
	/* Exercício 3
	public void adicionaContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente.add(contaCorrente);
	}
	
	public void adicionaContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca.add(contaPoupanca);
	}
	
	public List<ContaCorrente> getContaCorrente() {
		return this.contaCorrente;
	}
	
	public List<ContaPoupanca> getContaPoupanca() {
		return this.contaPoupanca;
	} */
	
	public void adicionaConta(Conta conta) {
		this.conta.add(conta);
	}
	
	public void removeConta(Conta conta) {
		this.conta.remove(conta);
	}
	
	public List<Conta> getListaDeConta() {
		return conta;
	}
}
