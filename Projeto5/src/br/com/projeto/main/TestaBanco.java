package br.com.projeto.main;

import br.com.projeto.modelo.Banco;
import br.com.projeto.modelo.ContaCorrente;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setNumero(113);
		cc1.setSaldo(9000);
		cc1.setLimite(7000);
		
		banco.criaConta(cc1);
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setNumero(114);
		cc2.setSaldo(5000);
		cc2.setLimite(10000);
		
	
		banco.criaConta(cc2);
		
		ContaCorrente cc3 = new ContaCorrente();
		cc3.setNumero(115);
		cc3.setSaldo(1000);
		cc3.setLimite(500);
		
		banco.criaConta(cc3);
		
		banco.saca(cc3, 150);
		
		banco.deposita(cc1, 6000, cc2);
		
		System.out.println(cc1.movimenta("MCDONALDS SP MARKET", (float) 53.65, "Crédito"));
		System.out.println(cc2.movimenta("EYETOY BRINQUEDOS", (float) 195.90, "Débito"));
		System.out.println(cc3.movimenta("SUMIRE", (float) 250.85, "Crédito"));
		
		System.out.println(banco.emiteSaldo(cc1));
		System.out.println(banco.emiteSaldo(cc2));
		System.out.println(banco.emiteSaldo(cc3));

		
	}

}
