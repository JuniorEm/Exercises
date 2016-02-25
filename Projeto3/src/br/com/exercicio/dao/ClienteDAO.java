package br.com.exercicio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.exercicio.jdbc.CentralConnection;
import br.com.exercicio.jdbc.ConnectionFactory;
import br.com.exercicio.modelo.Cliente;

public class ClienteDAO {

	public void adiciona(Cliente cliente) {
		Connection con = new CentralConnection().getConnectionMySql();
		Connection con2 = new CentralConnection().getConnectionSqlServer();
		String sql = "INSERT INTO cliente (nome, cpf, fone, renda) VALUES (?, ?, ?, ?)";
		try {

			PreparedStatement ps1 = con.prepareStatement(sql);
			ps1.setString(1, cliente.getNome());
			ps1.setString(2, cliente.getCpf());
			ps1.setString(3, cliente.getFone());
			ps1.setFloat(4, cliente.getRenda());
			ps1.execute();
			ps1.close();
			System.out.println("Cliente adicionado com sucesso. . . (MySQL)");
			

			PreparedStatement ps2 = con2.prepareStatement(sql);
			ps2.setString(1, cliente.getNome());
			ps2.setString(2, cliente.getCpf());
			ps2.setString(3, cliente.getFone());
			ps2.setFloat(4, cliente.getRenda());
			ps2.execute();
			ps2.close();
			System.out.println("Cliente adicionado com sucesso. . . (SqlServer)");


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível inserir dados no Banco de Dados!", e);
		}
	}

}
