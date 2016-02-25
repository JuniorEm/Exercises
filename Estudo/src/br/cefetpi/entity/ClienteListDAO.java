package br.cefetpi.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClienteListDAO implements ClienteDAO {
	List<Cliente> cliente;
	int i = 0;
	
	//Constructors
	public ClienteListDAO() {
		this.cliente = new ArrayList<Cliente>(10); //Construtor com o Array implementado
	}
	
	//Get & Set
	
	//-------------------------------------
	
	//Methods


	@Override
	public void save(Cliente entity) {
		// TODO Auto-generated method stub
		this.cliente.add(entity);
		System.out.println("Cliente adicionado com sucesso!");
		}
		

	/*@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(); //Cria o objeto na hora de chamar o método
		id = cliente.getId(); //Atribui que id é igual ao retorno do cliente normal e deleta o id passado por parâmetro
		this.cliente.remove(id);

	}*/
	
	
	@Override
	public void delete(Cliente entity) {
		this.cliente.remove(entity);
	}
		
		



	
	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.cliente.size(); i++) { //For usado para percorrer o ArrayList
			if (id == this.cliente.get(i).getId()) { //Se id passado como parâmetro for igual ao id que ele pegou no índice
				return this.cliente.get(i); //retorne esse ID
			} //Break não utilizado porque ao cair no IF ele atende a condição e sai fora
		}
		 //Senão retorne nulo
			return null;
	}


	@Override
	public List find() { //Retorna todos os clientes
		// TODO Auto-generated method stub
			return this.cliente;
	}
		


	@Override
	public Cliente findByCpf(String cpf) { //Funcionando
		// TODO Auto-generated method stub
		for (int i = 0; i<this.cliente.size(); i++) {
			if (cpf == this.cliente.get(i).getCpf()) {
				 //Return aqui porque se o cpf for igual ao getCpf então ele retorna o cliente respectivo cliente
				return this.cliente.get(i);
			}
		}
			//Senão, se não tem nada pós o for, retorne nulo
			
			return null;
	}


	@Override
	public List findByName(String nome) {
		// TODO Auto-generated method stub
		List<Cliente> cliente = new ArrayList<>();
		
		for (int i = 0; i < this.cliente.size(); i++) {
			if (this.cliente.get(i).getNome().equals(nome)) { //Nesse caso não há necessidade de um "senão", ele simplesmente adiciona ou não adiciona
				cliente.add(this.cliente.get(i));
			}
		}
			return cliente; //É por isso que o return vem depois de tudo, ele retorna depois de carregar a lista.
	}
	
	public List teCopiei() {
		List<Cliente> cli = new ArrayList<>();
		
		for (int i = 0; i < this.cliente.size(); i++) {
			cli.add(this.cliente.get(i));
			
	}
		System.out.println("Lista que fiz o backup de meus dados: " + cli);
		
		return this.cliente;
	}
	

}
