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
		Cliente cliente = new Cliente(); //Cria o objeto na hora de chamar o m�todo
		id = cliente.getId(); //Atribui que id � igual ao retorno do cliente normal e deleta o id passado por par�metro
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
			if (id == this.cliente.get(i).getId()) { //Se id passado como par�metro for igual ao id que ele pegou no �ndice
				return this.cliente.get(i); //retorne esse ID
			} //Break n�o utilizado porque ao cair no IF ele atende a condi��o e sai fora
		}
		 //Sen�o retorne nulo
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
				 //Return aqui porque se o cpf for igual ao getCpf ent�o ele retorna o cliente respectivo cliente
				return this.cliente.get(i);
			}
		}
			//Sen�o, se n�o tem nada p�s o for, retorne nulo
			
			return null;
	}


	@Override
	public List findByName(String nome) {
		// TODO Auto-generated method stub
		List<Cliente> cliente = new ArrayList<>();
		
		for (int i = 0; i < this.cliente.size(); i++) {
			if (this.cliente.get(i).getNome().equals(nome)) { //Nesse caso n�o h� necessidade de um "sen�o", ele simplesmente adiciona ou n�o adiciona
				cliente.add(this.cliente.get(i));
			}
		}
			return cliente; //� por isso que o return vem depois de tudo, ele retorna depois de carregar a lista.
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
