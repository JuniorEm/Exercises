
public class Professor extends Empregado {
	
	
	//Constructors
	public Professor(String nome, String sobrenome, double salario){
		super(nome, sobrenome, salario);
	}
	
	
	//Get & Set
	
	public double getSalarioPrimeiraParcela(){ //Override ->Sobreescri��o de M�todo
		return salario;
	}
	
	public double getSalarioSegundaParcela(){ //Override ->Sobreescri��o de M�todo
		return 0;
	}

}
