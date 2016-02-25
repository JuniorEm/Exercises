package Ex;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Banco {
	List<Conta> contas = new LinkedList<>();
	
	private Map<String, Conta> exemplo;
	
	//Constructors
	public Banco() {}
	
	
	//Methods
	public void adiciona(Conta conta) {
		contas.add(conta);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		int i = 0;
		for (Conta conta : contas) {
			exemplo.put(conta.nomeDoCliente, conta);
			i++;
		}
			return this.contas.get(i);
		
	}
}
