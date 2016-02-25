package br.com.relembre.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.relembre.jdbc.ConnectionFactory;
import br.com.relembre.modelo.Cliente;

public class ClienteDao {
	
	public void adiciona(Cliente cliente) {
		Connection con = new ConnectionFactory().getConnection(); //A classe Connection é abstrata - Não é possível dar new em classe abstrata
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO cliente (nome, empresa, cargo, cpf) VALUES (?, ?, ?, ?)");
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getEmpresa());
			ps.setString(3, cliente.getCargo());
			ps.setString(4, cliente.getCpf());
			
			ps.execute();
			System.out.println("Cliente adicionado com sucesso!");
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException("Impossível adicionar cliente!" , e);
		}
	}
	
	public void exclui(Cliente cliente) {
		Connection con = new ConnectionFactory().getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM cliente WHERE nome = ?");
			ps.setString(1, cliente.getNome());
			ps.execute();
			System.out.println("Cliente removido com sucesso!");
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException("Impossível deletar cliente");
		}	
	}
	
	public void update(Cliente cliente) {
	}
}
