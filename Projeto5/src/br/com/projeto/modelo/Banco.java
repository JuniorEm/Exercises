package br.com.projeto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<ContaCorrente> contas = new ArrayList<>();
	
	//Constructors
	public Banco () {
		this.contas = new ArrayList<>();
	}
	
	//Methods
	public void criaConta(ContaCorrente contaCorrente) {
		contas.add(contaCorrente);
		System.out.println("Conta criada com sucesso!");
	}
	
	public void excluiConta(ContaCorrente contaCorrente) {
		contas.remove(contaCorrente);
		System.out.println("Conta removida com sucesso!");
	}
	
	public void saca(ContaCorrente contaCorrente, float valor) {
		float saldo = contaCorrente.getSaldo();
			if (valor < contaCorrente.getLimite() & valor > 0) {
				saldo = saldo - valor;
				contaCorrente.setSaldo(saldo);
			} else {
					System.out.println("Impossível realizar o saque!");
			}

			
		}
		
		
		
	
	public void deposita(ContaCorrente contaCorrente, float valor, ContaCorrente outraContaCorrente) {
		this.saca(contaCorrente, valor);
		float saldo = outraContaCorrente.getSaldo();
		saldo =+ valor;
		outraContaCorrente.setSaldo(outraContaCorrente.getSaldo() + saldo);
	
		}
	
	public String emiteSaldo(ContaCorrente contaCorrente) {
		return "\nSaldo atual da Conta de Número "+ contaCorrente.getNumero() + ": " +contaCorrente.getSaldo();
	}
	}
	


