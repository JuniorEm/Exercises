package br.com.teste.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.teste.jdbc.ConnectionFactory1;
import br.com.teste.jdbc.ConnectionFactory2;
import br.com.teste.modelo.Cliente;

public class ClienteDao {

	
	public void adiciona(Cliente cliente) {
		Connection connection1 = new ConnectionFactory1().getConnection(); //Primeira conexão com o MySql, aqui colocamos
		//Numa variável do tipo connection, porque retornamos uma conexão!
		Connection connection2 = new ConnectionFactory2().getConnection(); //Segunda conexão, SQL SERVER
		
		String sql = "INSERT INTO cliente (nome, cpf, fone, renda) VALUES (?, ? , ? ,?)";
		try {
			PreparedStatement ps1 = connection1.prepareStatement(sql);
			ps1.setString(1, cliente.getNome());
			ps1.setString(2, cliente.getCpf());
			ps1.setString(3, cliente.getFone());
			ps1.setFloat(4, cliente.getRenda());
			ps1.execute(); //Executa o comando SQL
			ps1.close(); //Encerra a execução dos comandos
			System.out.println("Inserção realizada com sucesso em: MySQL");
			
			PreparedStatement ps2 = connection2.prepareStatement(sql);
			ps2.setString(1, cliente.getNome());
			ps2.setString(2, cliente.getCpf());
			ps2.setString(3, cliente.getFone());
			ps2.setFloat(4, cliente.getRenda());
			ps2.execute();
			ps2.close();
			System.out.println("Inserção realizada com sucesso em: SQL Server");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível inserir no Banco de Dados!", e);
		}
			try {
				connection1.close();
				connection2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Impossível realizar operação de fechamento!", e);
			}
			
	}
	
	public void remove(Cliente cliente) {
		Connection connection1 = new ConnectionFactory1().getConnection(); 
		Connection connection2 = new ConnectionFactory2().getConnection();
		String sql = "DELETE FROM cliente WHERE nome = ?";
		try {
			PreparedStatement ps1 = connection1.prepareStatement(sql);
			ps1.setString(1, cliente.getNome());
			ps1.execute();
			ps1.close();
			System.out.println("Remoção efetuada com sucesso! MySQL note;");
			PreparedStatement ps2 = connection2.prepareStatement(sql);
			ps2.setString(1, cliente.getNome());
			ps2.execute();
			ps2.close();
			System.out.println("Remoção efetuada com sucesso! SQLServer note;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Argumentos inválidos!", e);
		}
	}
		
		public List<Cliente> getLista () {
			Connection connection1 = new ConnectionFactory1().getConnection(); 
			Connection connection2 = new ConnectionFactory2().getConnection();
			
			List<Cliente> clientes = new ArrayList<>();
			String sql = "SELECT * FROM cliente";
			try {
				PreparedStatement ps1 = connection1.prepareStatement(sql);
				ResultSet rs = ps1.executeQuery(); //Retorna o que o comando SQL pegou!
				//ResultSet nada mais é que um cursor para dados recebidos
				while (rs.next()) {
					Cliente cliente = new Cliente();	//Aqui nesse caso estaremos passando o resultado da Query com as colunas
					System.out.println("MYSQL!");
					cliente.setNome(rs.getString("nome")); //Seta no nome do cliente, o resultado da coluna Nome
					cliente.setCpf(rs.getString("cpf")); //Seta no cpf do cliente, o resultado da coluna CPF
					cliente.setFone(rs.getString("fone")); //Seta no fone do cliente, o resultado da coluna Fone
					cliente.setRenda(rs.getFloat("renda")); //Seta na renda do cliente, o resultado da coluna renda
					
					clientes.add(cliente);	
				}
					
					
					
				PreparedStatement ps2 = connection2.prepareStatement(sql);
				ResultSet rs2 = ps2.executeQuery();
				while (rs2.next()) {
					Cliente cliente = new Cliente();
					cliente.setNome(rs2.getString("nome"));
					cliente.setCpf(rs2.getString("cpf"));
					cliente.setFone(rs2.getString("fone"));
					cliente.setRenda(rs2.getFloat("renda"));
					
					clientes.add(cliente);
		
						
				}
					rs.close();
					ps1.close();
					rs2.close();
					ps2.close();
					return clientes;
								
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Impossível de realizar a consulta!", e);
			
					
		}
				
	}
		
		public void altera(Cliente cliente) {
			Connection connection1 = new ConnectionFactory1().getConnection();
			Connection connection2 = new ConnectionFactory2().getConnection();
			String sql = "UPDATE cliente SET nome = ?, cpf = ?, fone = ?, renda = ? WHERE id = ?";
			try {
				PreparedStatement ps1 = connection1.prepareStatement(sql);
				
				ps1.setString(1, cliente.getNome());
				ps1.setString(2, cliente.getCpf());
				ps1.setString(3, cliente.getFone());
				ps1.setFloat(4, cliente.getRenda());
				ps1.setInt(5, cliente.getId());
				ps1.execute();
				ps1.close();
				System.out.println("Alteração realizada com sucesso! : MYSQL");
			
				PreparedStatement ps2 = connection2.prepareStatement(sql);
				ps2.setString(1, cliente.getNome());
				ps2.setString(2, cliente.getCpf());
				ps2.setString(3, cliente.getFone());
				ps2.setFloat(4, cliente.getRenda());
				ps2.setInt(5, cliente.getId());
				ps2.execute();
				ps2.close();
				System.out.println("Alteração realizada com sucesso! : SQLSERVER");
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Impossível realizar operação de alteração!", e);
			}
			
			try {
				connection1.close();
				connection2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Impossível realizar operação de fechamento com os Bancos de Dados!");
			}
			
		}
}

