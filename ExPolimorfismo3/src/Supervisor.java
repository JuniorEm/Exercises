
public class Supervisor extends Funcionario {
	
	//Constructors
	public Supervisor() { 
		//Empty Constructor
		super();
	}
	
	public Supervisor(String nome) {
		super(nome);
	}
	
	public Supervisor(String nome, String ensino) {
		super(nome, ensino);
	}
	
	//Get & Set
	public double getComissao() {
		return super.getRenda() + 600.00;
	}
	
	//Methods
	public String toString() {
		String dados = "\nNome: "+super.getNome()+
					"\nComiss�o: "+this.getComissao()+
					"\nSal�rio Total: "+this.getRenda();
		return dados;
	}
	

}
