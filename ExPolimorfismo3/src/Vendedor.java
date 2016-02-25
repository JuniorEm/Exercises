
public class Vendedor extends Funcionario {
	
	//Constructors
	
	public Vendedor() { 
		//Empty Constructor
		super();
	}
	
	public Vendedor(String nome) {
		super(nome);
	}
	
	public Vendedor (String nome, String ensino) {
		super(nome, ensino);
	}
	
	//Get & Set
	public double getComissao() {
		return super.getRenda() + 250.00;
	}

}
