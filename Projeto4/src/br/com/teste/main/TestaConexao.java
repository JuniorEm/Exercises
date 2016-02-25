package br.com.teste.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.teste.jdbc.ConnectionFactory1;
import br.com.teste.jdbc.ConnectionFactory2;

public class TestaConexao {
	public static void main(String[] args) {
		Connection connection = new ConnectionFactory1().getConnection();
		System.out.println("Conex�o ao MySQL realizada com sucesso!");
		Connection connection2 = new ConnectionFactory2().getConnection();
		System.out.println("Conex�o ao SQL Server realizada com sucesso!");
		try {
			connection.close();
			connection2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Imposs�vel fechar a conex�o com o Banco de Dados!", e);
		}


		
	}

}
