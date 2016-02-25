
public class ContaPoupanca extends Conta {
	private int diaRendimento;

	// Constructors
	public ContaPoupanca() {
		super();
	}

	// Get & Set
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public int getDiaRendimento() {
		return this.diaRendimento;
	}

	public double getSaldo() {
		if (this.saldo < 0) {
			System.out.println("A conta poupança não pode ter saldo negativo");
		}
		return this.saldo;
	}

	// Methods
	public void saca(double valor) {
		if (this.saldo >= valor) {
			if (valor > 0) {
				this.saldo = this.saldo - valor;
			} else {
				System.out.println("O valor precisa ser maior do que 0");
			}
		} else {
			System.out.println("Saque não permitido! Motivo: Saldo insuficiente");
		}
	}

}
