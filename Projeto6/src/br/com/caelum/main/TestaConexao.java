package br.com.caelum.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection(); //Retorna uma Connection
		System.out.println("Conex�o realizada com sucesso!");
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Imposs�vel realizar o fechamento da conex�o", e);
		}
	}

}
