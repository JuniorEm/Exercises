package Ex;

import java.util.Collections;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.nomeDoCliente = "Zebedeu";
		cc.numero = 150;
		cc.agencia = 6545;
		cc.saldo = 1500;
		cc.getBonificacao();
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.nomeDoCliente = "Jandira";
		cc2.numero = 600;
		cc2.agencia = 1500;
		cc2.saldo = 1900;
		cc2.getBonificacao();
		
		ContaCorrente cc3 = new ContaCorrente();
		cc3.nomeDoCliente = "Ailta";
		cc3.numero = 600;
		cc3.agencia = 1500;
		cc3.saldo = 1200;
		cc3.getBonificacao();
		
		ContaCorrente cc4 = new ContaCorrente();
		cc4.nomeDoCliente = "Mimo";
		cc4.numero = 500;
		cc4.agencia = 1600;
		cc4.saldo = 1200;
		cc4.getBonificacao();
		
		ContaCorrente cc5 = new ContaCorrente();
		cc5.nomeDoCliente = "José Dirceu";
		cc5.numero = 700;
		cc5.agencia = 5600;
		cc5.saldo = 900;
		cc5.getBonificacao();
		
		System.out.println(cc.adiciona(cc));
		System.out.println(cc.adiciona(cc2));
		System.out.println(cc.adiciona(cc3));
		System.out.println(cc.adiciona(cc4));
		System.out.println(cc.adiciona(cc5));
		System.out.println(cc.mostra());
		
		

		
		Collections.sort(cc.mostra());
		
		System.out.println(cc.mostra());
		
		
	}
}
