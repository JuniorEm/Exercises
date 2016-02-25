package br.com.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory1 implements ConnectionFactoryInterface {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Conectando ao MySQL. . .");
			return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
			//O Driver Manager serve para registrar os Drivers dos Bancos de Dados
		} catch (SQLException e) { //CHECKED EXCEPTION - SQLEXCEPTION
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar a conexão com o Banco de Dados MySql!", e);
		}
	}

}
