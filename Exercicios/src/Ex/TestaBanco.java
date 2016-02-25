package Ex;

public class TestaBanco {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		Conta c3 = new ContaCorrente();
		c3.agencia = 99;
		c3.nomeDoCliente = "Paulo Silveira";
		Conta c4 = new ContaPoupanca();
		c4.agencia = 150;
		c4.nomeDoCliente = "Sérgio";
		Banco adicionador = new Banco();
		
		adicionador.adiciona(c1);
		adicionador.adiciona(c2);
		adicionador.adiciona(c3);
		adicionador.adiciona(c4);
		
		System.out.println(adicionador.pega(2));
		System.out.println("A quantidade de contas é: " + adicionador.pegaQuantidadeDeContas());
		
	}

}
