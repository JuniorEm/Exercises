package Ex;

public abstract class Conta {
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected String nomeDoCliente;
	
	//Constructors
	public Conta() {}
	
	public Conta(int numero, int agencia, double saldo){
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	
	//Get & Set
	public double getBonificacao(){
		return this.saldo*0.15;
	}
	
	//Methods
	 public String toString(){
		String dados = "\nNome: "+this.nomeDoCliente+
				 "\nNumero: "+this.numero+
				"\nAgencia: "+this.agencia+
				"\nSaldo: "+this.saldo+
				" \nBonificação: "+this.getBonificacao();
		return dados;
	}
	 
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}
