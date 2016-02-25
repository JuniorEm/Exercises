
public class Empregado extends Sujeito {
	protected int matricula;
	protected double salario;
	
	//Constructors
	public Empregado(){
		//Empty Constructor
	}
	
	public Empregado(String nome, String sobrenome, double salario){
		super(nome, sobrenome);
		this.salario = salario;
	}
	

	//Get & Set
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setSalario(double salario){
		if (salario>=788.00){
			this.salario = salario;
		} else {
			System.out.println("A mudança não pôde ser efetuada");
		}
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public double getSalarioPrimeiraParcela(){
		return this.salario*60/100;
	}
	
	public double getSalarioSegundaParcela(){
		return this.salario*40/100;
	}
}
