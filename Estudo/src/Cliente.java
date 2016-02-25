
public class Cliente {
	private int id;
	private String nome;
	private String fone;
	private double renda;
	
	//Constructors
	public Cliente(){
		//Empty Constructor
	}
	
	public Cliente(int id, String nome, String fone, double renda){
		this();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.renda = renda;
	}
	
	//Get & Set
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setFone(String fone){
		this.fone = fone;
	}
	
	public String getFone(){
		return this.fone;
	}
	
	public void setRenda(double renda){
		this.renda = renda;
	}
	
	public double getRenda(){
		return this.renda;
	}
	
	//Methods
	public String toString(){
		String dados = "\nID: "+this.id+
						"\nNome: "+this.nome+
						"\nFone: "+this.fone+
						"\nRenda: "+this.renda;
		return dados;
	}
	

	

}
