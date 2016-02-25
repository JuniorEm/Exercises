package br.com.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			System.out.println("Conectando. . .");
			return DriverManager.getConnection("jdbc:sqlserver://localhost; user=sa; password=1234;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("A conexão não pôde ser realizada ", e);
		}
	}
}
