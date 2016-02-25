
public class TestaConta {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.recebeSalario(15000);
		System.out.println("Saldo: " +cp1.getSaldo());
		cp1.saca(15000.0);
		System.out.println("Saldo: " +cp1.getSaldo());
		
	}

}
