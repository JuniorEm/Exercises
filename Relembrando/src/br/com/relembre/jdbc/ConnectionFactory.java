package br.com.relembre.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			System.out.println("Conectando ao MySQL...");
			return DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "1234");
		} catch(SQLException e) {
			throw new RuntimeException("Impossível se conectar ao MySQL!", e);
		}
	}
}
