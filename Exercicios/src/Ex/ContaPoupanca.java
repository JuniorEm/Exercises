package Ex;

import java.util.Arrays;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	

	//Constructors
	public ContaPoupanca() {
		System.out.println("\nCriando Conta Poupan�a");
	}
	
	public ContaPoupanca(int numero, int agencia, double saldo) {
		super(numero, agencia, saldo);
		// TODO Auto-generated constructor stub
		System.out.println("\nCriando Conta Poupan�a"); //Lembrando que temos um protected e n�o um private
	}


		


	@Override
	public int compareTo(ContaPoupanca outraContaPoupanca) {
		// TODO Auto-generated method stub
		if (this.numero < outraContaPoupanca.numero) {     //-- Ordenando por n�mero da conta
			return -1;
		}

		if (this.numero < outraContaPoupanca.numero) {
			return 1;
		}

		return 0;
	}
	
	

}
