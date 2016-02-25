
public class Sujeito {
	protected String nome;
	protected String sobrenome;
	
	//Constructors
	public Sujeito(){
		//Empty Constructor
	}
	
	public Sujeito(String nome, String sobrenome){
		this();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	//Get & Set
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto(){
		return this.nome+" "+this.sobrenome;
	}
	
	//Methods
	

}
