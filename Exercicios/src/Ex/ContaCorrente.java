package Ex;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente>{
	
	List<ContaCorrente> contaCorrente = new ArrayList<>();
	
	
	//Constructors
	public ContaCorrente() {
		System.out.println("\nCriando Conta Corrente");
	}
	
	public ContaCorrente(int numero, int agencia, double saldo){
		super(numero, agencia, saldo);
		System.out.println("\nCriando Conta Corrente");
	}
	
	//Methods

	/*@Override
	public int compareTo(ContaCorrente outraContaCorrente) {
		// TODO Auto-generated method stub
		if (this.saldo < outraContaCorrente.saldo) {
			return -1;
		} 
			if (this.saldo > outraContaCorrente.saldo) {
				return 1;
		}
			return 0;
	} */
	
	@Override
	public int compareTo(ContaCorrente outraContaCorrente) {
		int comparacao = this.nomeDoCliente.compareToIgnoreCase(outraContaCorrente.nomeDoCliente);
		
		if (comparacao < 0) {
			return -1;
		}
		
		if (comparacao > 0) {
			return 1;
		}
		
			return 0;
	}
	
	public String adiciona(ContaCorrente contaCorrente) {
		
		this.contaCorrente.add(contaCorrente);
		
		return "Adicionado com sucesso";
	}
	

	
	public List mostra() {
		return this.contaCorrente;		
	}

}
