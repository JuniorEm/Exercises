package Ex;

import java.util.HashMap;
import java.util.Map;

public class TestaOrdenacao {

	public static void main(String[] args) { //Static Main não suporta o .this
		/*
		List<ContaPoupanca> contaMestre = new LinkedList<>();
		Random r = new Random();

		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.numero = 1973;
		contaMestre.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.numero = 1462;
		contaMestre.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.numero = 1854;
		contaMestre.add(c3);
		

		
		for (int i = 1; i <10; i++) { 
			ContaPoupanca c = new ContaPoupanca();
			c.numero = i;
			c.saldo = r.nextInt(150); //Passei o valor máximo por parâmetro e ele randomizou o saldo
			contaMestre.add(c);
			System.out.println("Número: " + contaMestre.get(i).numero); //Pega cada elemento do for com get(i)
		}
		
	

		
		System.out.println(contaMestre); */
		ContaCorrente c1 = new ContaCorrente();
		c1.saldo = 500000;
		ContaCorrente c2 = new ContaCorrente();
		c2.saldo = 1500;
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("auxiliar administrativo", c2);
		
		ContaCorrente contaDoDiretor = mapaDeContas.get("auxiliar administrativo");
		System.out.println(contaDoDiretor.saldo);
		

		
		
		
		

	}
}
