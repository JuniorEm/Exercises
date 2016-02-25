package Exercicios;

public class Funcionario {
	String nome;
	String depto;
	double salario;
	Data dataDeEntrada;
	boolean permissao;
	String rg;
	


	// Methods
	public void recebeAumento(double valor) {
		this.salario = this.salario + valor;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public boolean demite(Funcionario f) { //O que vai ser passado como parâmetro
		boolean permissao = this.permissao; //Boolean permissão é igual a permissão atual, poderia ser feito apenas com a variável this.permissao
		if (permissao == false) { //Se a permissão for falsa então imprima a mensagem de que o Funcionário não tem permissão para demitir
			System.out.println("\nO funcionário "+this.nome+" não tem permissão para demitir");
			return false; //return falso
		} else { //Senão (a permissão só pode ser verdadeira) permissão for verdadeira então imprima quem demitiu quem
			System.out.println("\nO funcionário "+this.nome+" demitiu o funcionário " +f.nome);
			return true; //retorne verdadeiro
		}
	}
	
	public String print(){
		String dados = "Nome: "+this.nome+
					   "\nDepartamento: "+this.depto+
					   "\nSalário: "+this.salario+
					   "\nData de Entrada: "+this.dataDeEntrada.formatada()+
					   "\nRG: "+this.rg;
		return dados;
	}

}
