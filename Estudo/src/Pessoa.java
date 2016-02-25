
public class Pessoa {
	String nome;
	int idade;
	
	//Constructors
	public Pessoa(){
	}
	
	public Pessoa (String nome, int idade){
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Get & Set
	
	
	//Methods
	public int fazAniversario(){
		return this.idade = this.idade + 1;
	}

	public String mostra(){
		String info = "\nNome: "+nome+
					"\nIdade: "+idade;
		return info;
	}
}
