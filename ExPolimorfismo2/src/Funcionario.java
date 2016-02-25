
public class Funcionario extends Pessoa {
	protected float salario;

	// Constructors
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}

	// Get & Set
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getSalario() {
		return this.salario;
	}
	
	//Methods
	public float calculaImposto(){ //GET
		return this.salario*3/100;
	}
	
	public String imprimeDados(){
		String info = "\nNome: "+super.nome+
				"\nNascimento: "+super.nascimento.formata()+
				"\nSalário: R$"+this.salario+
				"\nImposto: "+this.calculaImposto();
		return info;
	}

}
