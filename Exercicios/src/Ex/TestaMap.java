package Ex;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(); //Exemplo de Polimorfismo, uma Conta pode ser tanto uma Conta Corrente quanto uma Poupan�a
		c1.deposita(15000);
		
		Conta c2 = new ContaPoupanca();
		c2.deposita(10000);
		
		Conta c3 = new ContaCorrente();
		c3.deposita(13000);
		
		Map<String, Conta> mapaDeContas = new HashMap<>(); //Aqui estou utilizando o Generics
		//Generics utilizado para dar seguran�a em rela��o ao tipo de dados que estar�o sendo inseridos no Mapa
		//Temos uma key, e uma conta, se n�o houvesse o generics ter�amos que dar um casting para certificar que
		//O nosso segundo elemento "Conta" � um objeto do tipo "Conta" realmente
		mapaDeContas.put("Diretor", c1);
		mapaDeContas.put("Gerente", c2);
		mapaDeContas.put("Supervisor", c3);
		
		Conta contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println("Sal�rio do Diretor: " + contaDoDiretor.saldo);
	}

}
