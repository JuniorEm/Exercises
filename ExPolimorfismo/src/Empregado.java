
public class Empregado extends Pessoa {
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;

	// Constructors
	public Empregado() {
		//Empty Constructor
	}
	
	public Empregado(String nome, double salarioBase) {
		super(nome);
		this.salarioBase = salarioBase;
	}

	public Empregado(String nome, String endereco, String telefone, double salarioBase, int codigoSetor, double imposto) {
		super(nome, endereco, telefone);
		this.salarioBase = salarioBase;
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;
		/*this(nome, salarioBase);
		this.endereco = endereco;
		this.telefone = telefone;
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;*/
	}

	// Get & Set
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getCodigoSetor() {
		return this.codigoSetor;
	}

	public void setSalarioBase(double salario) {
		this.salarioBase = salario;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double getImposto() {
		return this.imposto;
	}
	
	//Methods
	public double calculaSalario(){
		return this.salarioBase - this.imposto;
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
