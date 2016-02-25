
public class Pessoa {
	protected String nome;
	protected String endereco;
	protected String telefone;
	protected static int cont;
	
	//Constructors
	public Pessoa(){
		//Empty Constructor
		cont++;
	}
	
	public Pessoa(String nome){
		this();
		this.nome = nome;
	}
	
	public Pessoa(String nome, String endereco, String telefone){
		this(nome);
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Get & Set
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	//Methods
	public int getTotal(){
		return cont;
	}
	
	
	public String mostra(){
		String dados = "\nNome: "+this.nome+
					"\nEndereço: "+this.endereco+
					"\nTelefone: "+this.telefone+
					"\nNúmero: "+this.getTotal();
		return dados;
	}
	
	
	


}
