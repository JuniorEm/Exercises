
public abstract class Conta {
	protected double saldo;
	protected double salario;
	
	//Constructor
	public Conta(){
		//Empty Constructor
	}
	
	//Get & Set
	public double getSaldo(){
		return this.saldo;
	}
	
	//Methods
	public void recebeSalario(double salario){
		this.saldo = this.saldo + salario;
	}
	
	public void saca (double valor){
		this.saldo = this.saldo - valor;
	}
	
	
	public void deposita(Conta destino, double valor){
		this.saca(valor);
		destino.saldo = destino.saldo + valor; //Lembrando que vale o que vai ser passado por parâmetro, ao que ele tem acesso
	}
	
	
	

}
