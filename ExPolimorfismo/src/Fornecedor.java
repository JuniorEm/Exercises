
public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;

	// Constructors
	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		this(nome, valorCredito, valorDivida);
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Get & Set
	public void setValorCredito(double valorCredito){
		this.valorCredito = valorCredito;
	}
	
	public double getValorCredito(){
		return this.valorCredito;
	}
	
	public void setValorDivida(double valorDivida){
		this.valorDivida = valorDivida;
	}
	
	public double getValorDivida(){
		return this.valorDivida;
	}
	
	//Methods
	public double obtemSaldo(){ //Obtém Saldo seria o mesmo que getSaldo
		return this.valorCredito - this.valorDivida;
	}
	
	public String mostra(){
		String dados = "\nNome: "+this.nome+
					"\nEndereço: "+this.endereco+
					"\nTelefone: "+this.telefone+
					"\nValor Crédito: "+this.valorCredito+
					"\nValor Dívida: "+this.valorDivida+
					"\nSaldo: "+this.obtemSaldo()+
					"\nNúmero: "+this.getTotal();
		return dados;
	}
	
	

}
