
public class Gerente extends Funcionario {
	
	//Constructors
	public Gerente() {
		super();
	}
	
	public Gerente(String nome) {
		super(nome);
	}
	
	public Gerente(String nome, String ensino) {
		super(nome, ensino);
	}
	
	//Get & Set
	/*public double getRenda() { //2500
		return super.getRenda() + 1500.00;
	}*/
	
	public double getComissao() {
		return super.getRenda() + 1500.00;
	}
	
	//Methods
	public String toString() {
		String dados = "\nNome: "+super.getNome()+
					"\nComissão: "+this.getComissao()+
					"\nSalário Total: "+super.getRenda();
		return dados;
	}


}
