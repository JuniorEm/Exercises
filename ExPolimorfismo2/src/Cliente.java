
public class Cliente extends Pessoa {
	private int codigo;
	
	//Constructors
	public Cliente(){
		super();
	}
	
	public Cliente(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	//Get & Set
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	//Methods
	
	public String imprimeDados(){
		String info = "\nCódigo: "+this.codigo+ 
					"\nNome: "+super.nome+
					"\nNascimento: "+super.nascimento.formata();
		return info;
	}
	
	
}
