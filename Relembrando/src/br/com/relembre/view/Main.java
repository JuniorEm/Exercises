package br.com.relembre.view;

import br.com.relembre.dao.ClienteDao;
import br.com.relembre.modelo.Cliente;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Monique Santos Martins", "Abril Comunicações", "Diretora Executiva", "39248319822");
		Cliente cliente2 = new Cliente("Ailton Aparecido Bezerra Junior", "Record", "Desenvolvedor JAVA", "40124151825");
		ClienteDao cDao = new ClienteDao();
		//cDao.adiciona(cliente2);
		cDao.exclui(cliente2);
	}
}
