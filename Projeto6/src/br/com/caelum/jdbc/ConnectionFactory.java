package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			System.out.println("Conectando ao SQL SERVER. . .");
			return DriverManager.getConnection("jdbc:sqlserver://localhost; databaseName=JUNIQ; user=sa; password=1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível se conectar com o Banco de Dados!", e);
		}
	}
}
