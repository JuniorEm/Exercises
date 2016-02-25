package br.com.teste.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.teste.jdbc.ConnectionFactory;

public class Main {
	public static void main(String[] args) {
		try {
		Connection con = new ConnectionFactory().getConnection();
		
		System.out.println("Conexão efetuada com sucesso!");
		
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e); 
		}
	}

}

