package br.com.exercicio.jdbc;

import java.sql.Connection;

public interface ConnectionFactory {
	
	public Connection getConnectionMySql();
	public Connection getConnectionSqlServer();

}
