package br.com.teste.jdbc;

import java.sql.Connection;

public interface ConnectionFactoryInterface {
	
	public Connection getConnection();
}
