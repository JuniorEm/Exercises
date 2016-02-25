
public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	
	//Constructors
	public Vendedor(String nome, String endereco, String telefone, double salarioBase, int codigoSetor, double imposto,
			double valorVendas, double comissao){
		super(nome, endereco, telefone, salarioBase, codigoSetor, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	//Get & Set
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getValorVendas() {
		return this.valorVendas;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getComissao() {
		return this.comissao + this.getValorVendas();
	}
	
	//Methods and Subscriptions
	public double calculaSalario(){
		return super.calculaSalario() + this.getComissao();
	}
	
	

}
