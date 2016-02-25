package br.com.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory2 implements ConnectionFactoryInterface {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Conectando ao SQL Server. . .");
			return DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName=test; user=sa; password=1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar conexão com o Banco de Dados SQL Server");
		}
	}

}
