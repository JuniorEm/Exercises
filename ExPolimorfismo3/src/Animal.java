
public abstract class Animal {
	protected String nome;
	protected int idade;

	// Constructors
	public Animal() {
		// Empty Constructor
	}

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Get & Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}
	
	//Methods
	public abstract String emiteSom();
	
	
	
}
