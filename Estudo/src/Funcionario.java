
public class Funcionario {
	String nome;
	String depto;
	double salario;
	Data dataDeEntrada;
	String rg;
	boolean permissao;
	

	//Constructors
	
	
	//Get & Set
	
	
	//Methods
	public void recebeAumento(double valor){
		this.salario = this.salario + valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario*12;
	}
	
	public boolean demite(Funcionario f){
		if (this.permissao==true){
			System.out.println("O funcionário "+f.nome+ " foi demitido");
			return true;
		} else {
			System.out.println("O funcionário "+this.nome+" não tem permissão para demitir");
			return false;
		}
	}
	
	public String mostra(){
		String info = "\nNome: "+this.nome+
					"\nDepartamento: "+this.depto+
					"\nSalário: "+this.salario+
					"\nData de Entrada: "+this.dataDeEntrada.formataData()+
					"\nRG: "+this.rg+
					"\nGanho anual: "+this.calculaGanhoAnual();
		return info;
	}
	

	
	

}
