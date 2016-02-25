
public class Administrador extends Empregado {
	private double ajudaCusto;

	// Constructors
	public Administrador(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	public Administrador(String nome, String endereco, String telefone, double salarioBase, int codigoSetor,
			double imposto, double ajudaCusto) {
		super(nome, endereco, telefone, salarioBase, codigoSetor, imposto);
		this.ajudaCusto = ajudaCusto;
	}

	// Get & Set
	public void setAjudaCusto(double valor) {
		this.ajudaCusto = valor;
	}
	
	public double getAjudaCusto() {
		return this.ajudaCusto;
	}
	
	//Methods
	public double calculaSalario(){
		return super.calculaSalario() + this.ajudaCusto;
	}
	
	public String mostra(){
		String dados = "\nNome: "+this.nome+
					"\nCódigo do Setor: "+this.codigoSetor+
					"\nEndereço: "+this.endereco+
					"\nTelefone: "+this.telefone+
					"\nSalário: "+this.calculaSalario()+
					"\nNúmero: "+this.getTotal();
		return dados;
	}

}
