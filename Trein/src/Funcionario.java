
public class Funcionario {
	protected String nome;
	protected String empresa;
	
	//Constructors
	public Funcionario() {}
	
	//Get & Set
	//No Get & Set 'cause that is not have private attributes
	
	//Methods
	public String toString() {
		return "\nNome: "+this.nome+
				"\nEmpresa: "+this.empresa;
	}

}
