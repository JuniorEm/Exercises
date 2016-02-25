package Examples;

public abstract class Conta {
	private double saldo;
	private double limite;
	public Cliente titular;
	
	//Constructors
	public Conta (double saldo, double limite){
		this.saldo = saldo;
		this.limite = limite;
	}
	
	//Get - Não há necessidade do Set pois estou pedindo pelo construtor
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public double getLimite(){
		return this.limite;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	
	


	//Methods
	
	public boolean saca(double valor){
		if (valor<=this.saldo) {
		this.saldo = this.saldo - valor;
		return true;
	} else {
		System.out.println("Impossível realizar operação de saque");
		return false;
	}
	}
	
	public void deposita(double valor){
		this.saldo=this.saldo+valor;
	}
		
		/*public void transfere(Conta destino, double valor){
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo+valor;
			
		}*/
	
		public boolean transfere(Conta destino, double valor){
			boolean retirou = this.saca(valor); //Pega o retorno da operação de saque
				if (retirou==false){ //Se retirou for falso, então ele retorna falso
					return false;
				} else { //Senão
					destino.deposita(valor); //A conta destino tem esse valor depositado
					return true;
				}
				
		}
		
		public String print(){
			String dados = titular.retornaDados();
			return dados;
		}
		
	
}
	
