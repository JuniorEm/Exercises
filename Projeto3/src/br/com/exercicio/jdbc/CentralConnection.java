package br.com.exercicio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CentralConnection implements ConnectionFactory {

	@Override
	public Connection getConnectionMySql() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Conectando ao MySQL. . .");
			return DriverManager.getConnection("jdbc:mysql://localhost/exercicio", "root", "1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível se conectar ao Banco de Dados", e);
		}
	}

	@Override
	public Connection getConnectionSqlServer() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Conectando ao Sql Server. . .");
			return DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433; databaseName=exercicio; user=sa; password=1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível se conectar ao Banco de Dados", e);
		}
	}

}
