package br.com.teste.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.teste.modelo.Contato;

public class GeraTabelas {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Manoel");
		contato.setCpf("11111111111");
		contato.setFone("39067433");
		contato.setRenda((float) 4500.84);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		
		System.out.println("ID do"
				+ " Contato: " + contato.getId());
		
		manager.close();
		
		factory.close();
		
	}

}
