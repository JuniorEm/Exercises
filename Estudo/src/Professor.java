
public class Professor extends Empregado {
	
	
	//Constructors
	public Professor(String nome, String sobrenome, double salario){
		super(nome, sobrenome, salario);
	}
	
	
	//Get & Set
	
	public double getSalarioPrimeiraParcela(){ //Override ->Sobreescrição de Método
		return salario;
	}
	
	public double getSalarioSegundaParcela(){ //Override ->Sobreescrição de Método
		return 0;
	}

}
