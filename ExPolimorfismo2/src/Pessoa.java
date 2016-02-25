
public abstract class Pessoa {
	protected String nome;
	protected Data nascimento;

	//Constructors
	public Pessoa(){
	}
	
	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}
	
	//Get & Set
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setData(Data nascimento){
		this.nascimento = nascimento;
	}
	
	public Data getData(){
		return this.nascimento;
	}
	
	//Methods
	public abstract String imprimeDados();
}
