
public class Cachorro extends Animal {
	
	//Constructor
	public Cachorro(){
		//Empty Constructor
	}
	
	public Cachorro(String nome, int idade){
		super(nome, idade);
	}
	
	//Get & Set
	//Empty
	//-------------------------------------------------------------------
	
	//Methods
	public String corre(){
		return "Corre";
	}
	
	public String emiteSom(){
		return "Au Au Au";
	}
}