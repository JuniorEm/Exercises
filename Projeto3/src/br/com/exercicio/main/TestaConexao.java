package br.com.exercicio.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;

import br.com.exercicio.dao.ClienteDAO;
import br.com.exercicio.jdbc.CentralConnection;
import br.com.exercicio.jdbc.ConnectionFactory;
import br.com.exercicio.modelo.Cliente;

public class TestaConexao {
	public static void main(String[] args) {
		ClienteDAO cd = new ClienteDAO();
		Cliente c1 = new Cliente();
		c1.setNome("Leonardo Rodrigues");
		c1.setCpf("11111111111");
		c1.setFone("33333333");
		c1.setRenda((float) 4555.50);
		cd.adiciona(c1);

		Connection connection = new CentralConnection().getConnectionMySql();
		System.out.println("Conexão com o MySQL realizada com sucesso!");
		Connection connection2 = new CentralConnection().getConnectionSqlServer();
		System.out.println("Conexão com o SqlServer realizada com sucesso!");

		try {
			connection.close();
			connection2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível fechar a conexão com o Banco de Dados", e);
		}

	}

}
