package br.com.caelum.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.modelo.Cliente;
import br.com.caelum.modelo.Conta;

public class BancoDao {
	
	
	//Methods
	public void adiciona(Cliente cliente) {
		Connection connection = new ConnectionFactory().getConnection();
		String sql = "INSERT INTO cliente (nome, cpf, rg, dataDeNascimento) VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3,  cliente.getRg());
			ps.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			ps.execute();
			ps.close();
			connection.close();
			System.out.println("Adicionado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar a instrução SQL");
		}
		
	}
	
	public void adiciona(Conta conta) {
		Connection connection = new ConnectionFactory().getConnection();
		String sql = "INSERT INTO conta (idCliente, numero, agencia, saldo, limite) VALUES (?,?,?,?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, conta.getIdCliente());
			ps.setInt(2, conta.getNumeroDaConta());
			ps.setInt(3, conta.getAgencia());
			ps.setBigDecimal(4, conta.getSaldo());
			ps.setBigDecimal(5, conta.getLimite());
			ps.execute();
			ps.close();
			System.out.println("Conta inserida com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar inserção na Tabela de Contas!");
		}
	}
	
	public void saca(Conta conta, BigDecimal value) {
		Connection connection = new ConnectionFactory().getConnection();
		String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";
		try {
			BigDecimal saldo = conta.getSaldo();
			conta.setSaldo(saldo.subtract(value));
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setBigDecimal(1, saldo.subtract(value)); //Subtração
			ps.setInt(2, conta.getNumeroDaConta());
			ps.execute();
			ps.close();
			System.out.println("Saque realizado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Ocorreu uma falha na operação!", e);
		}
	}
	
	public void transfere(Conta conta, BigDecimal value, Conta outraConta) {
		Connection connection = new ConnectionFactory().getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE conta SET saldo = ? WHERE numero = ?");
			PreparedStatement ps2 = connection.prepareStatement("UPDATE conta SET saldo = ? WHERE numero = ?");
			BigDecimal saldo = conta.getSaldo();
			BigDecimal saldoOutraConta = outraConta.getSaldo(); 
			ps.setBigDecimal(1, saldo.subtract(value));
			ps.setInt(2, conta.getNumeroDaConta());
			
			ps2.setBigDecimal(1, saldoOutraConta.add(value));
			ps2.setInt(2, outraConta.getNumeroDaConta());
			
			ps.execute();
			ps2.execute();
			ps.close();
			ps2.close();
			System.out.println("Transferência realizada com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar operação de transferência!", e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Não é possível encerrar a conexão!", e);
			}
		}
	}
	
	public List<Cliente> imprimeDadosDosClientes() {
		Connection connection = new ConnectionFactory().getConnection();
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM cliente");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				//Instanciamos o cliente para criar objetos contatos a cada vez que ele imprimir um resultado
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt(1)); //Populamos os atributos do objeto cliente com o resultado das Queries
				cliente.setNome(rs.getString(2));
				cliente.setCpf(rs.getString(3));
				cliente.setRg(rs.getString(4));
				Calendar data = Calendar.getInstance(); //Pega a data atual
				data.setTime(rs.getDate(5));
				cliente.setDataDeNascimento(data);
	
				clientes.add(cliente); //Adicionamos na lista
			}
			
			rs.close();
			ps.close();
			connection.close();
			
			return clientes;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar operação de impressão de dados!", e);
		}
	}
	
	public List<Conta> imprimeDadosDasContas() {
		Connection connection = new ConnectionFactory().getConnection();
		String sql = "SELECT * FROM conta";
		//Vamos preparar o nosso código SQL
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); //Retorno do tipo ResultSet, pega o resultado das colunas
			
			List<Conta> contas = new ArrayList<>();
			
			while (rs.next()) { //Enquanto houver um próximo resultado (note que rs.next é um boolean)
				Conta conta = new Conta(); //Conta deve estar dentro do iterador para criar todas as contas
				conta.setIdCliente(rs.getInt("idCliente"));
				conta.setNumeroDaConta(rs.getInt("numero"));
				conta.setAgencia(rs.getInt("agencia"));
				conta.setSaldo(rs.getBigDecimal("saldo"));
				conta.setLimite(rs.getBigDecimal("limite"));
				
				//adiciona objeto carregado dentro do array
				contas.add(conta);
			}		
				rs.close();
				ps.close();
				return contas;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Impossível realizar a busca!", e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Impossível fechar a conexão!", e);
			}
		}
	}

}
