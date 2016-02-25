
public class Gerente extends Funcionario {
	private String area;
	
	//Constructors
	public Gerente(){
		super();
	}
	
	public Gerente(String nome, float salario, String area) {
		super(nome, salario);
		this.area = area;
	}
	
	//Get & Set
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getArea(){
		return this.area;
	}
	
	//Methods
	public float calculaImposto(){
		return super.salario * 5/100;
	}
	
	public String imprimeDados(){
		String info = "\nNome: "+super.nome+
				"\nNascimento: "+super.nascimento.formata()+
				"\nCargo: "+this.area+
				"\nSalário: R$"+super.salario+
				"\nImposto: "+this.calculaImposto();
		return info;
	}


}
