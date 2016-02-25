package br.com.caelum.main;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.dao.BancoDao;
import br.com.caelum.modelo.Cliente;
import br.com.caelum.modelo.Conta;

public class TestaMostraConta {
	public static void main(String[] args) {
		BancoDao bancoDao = new BancoDao();
		
		
		List<Conta> contas = bancoDao.imprimeDadosDasContas();
		for (Conta c : contas) {
			System.out.println("\nId do Cliente: " + c.getIdCliente());
			System.out.println("Número da Conta: " + c.getNumeroDaConta());
			System.out.println("Agência: " + c.getAgencia());
			System.out.println("Saldo: " + c.getSaldo());
			System.out.println("Limite: " +c.getLimite());
		}
		
	List<Cliente> clientes = bancoDao.imprimeDadosDosClientes();
		
		for (Cliente c : clientes) {
			System.out.println("\nId do Contato: " + c.getId());
			System.out.println("Nome do Contato: " + c.getNome());
			System.out.println("CPF: " + c.getCpf());
			System.out.println("RG: " + c.getRg());
			System.out.println("Data de Nascimento: " + c.getDataDeNascimento().getTime());
		}
		
		
		
		
		
		
	}
}
