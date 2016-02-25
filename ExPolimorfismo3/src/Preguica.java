
public class Preguica extends Animal {
	
	//Constructors
	public Preguica() {
		//Empty Constructor
	}
	
	public Preguica(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Get & Set
	//Empty
	//-------------------------------------------------------------------
	
	//Methods
	@Override
	public String emiteSom() {
		// TODO Auto-generated method stub
		return "ubo ubo ubo";
	}

	public String sobeEmArvore() {
		return "Sobe em Arvore";
	}
}
