
public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;
	
	
	public Operario(String nome, String endereco, String telefone, double salarioBase, int codigoSetor, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, salarioBase, codigoSetor, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
	}
	
	//Get & Set
	public void setValorProducao(double valorProducao){
		this.valorProducao = valorProducao;
	}
	
	public double getValorProducao(){
		return this.valorProducao;
	}
	
	public void setComissao(double comissao){
		this.comissao = comissao;
	}
	
	public double getComissao(){
		return this.comissao + this.getValorProducao();
	}
	
	//Methods
	public double calculaSalario(){
		return super.calculaSalario() + this.getComissao();
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
