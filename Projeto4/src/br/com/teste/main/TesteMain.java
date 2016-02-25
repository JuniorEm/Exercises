package br.com.teste.main;

import java.util.List;

import br.com.teste.dao.ClienteDao;
import br.com.teste.modelo.Cliente;

public class TesteMain {
	public static void main(String[] args) {
		ClienteDao c = new ClienteDao();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("DBA Ailton Junior");
		cliente1.setCpf("11111111111");
		cliente1.setFone("11111111");
		cliente1.setRenda((float) 1500.75);
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2.setNome("Developer Monster Junior");
		cliente2.setCpf("12399994313");
		cliente2.setFone("33331231");
		cliente2.setRenda((float) 139700.75);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Gerente Ailton Junior");
		cliente3.setCpf("22222333322");
		cliente3.setFone("11311211");
		cliente3.setRenda((float) 15700.85);
		
		/*
		c.adiciona(cliente1);
		c.adiciona(cliente2);
		c.adiciona(cliente3); */
	
		
		//c.remove(cliente1);
		
		/*
		List<Cliente> clientes = c.getLista();
		
		
		for (Cliente cliente : clientes) {
			System.out.println("\nNome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Fone: " + cliente.getFone());
			System.out.println("Renda: " + cliente.getRenda());
		} */
		
		c.altera(cliente2);
	}

}
