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

	public boolean demite(Funcionario f) { //O que vai ser passado como par�metro
		boolean permissao = this.permissao; //Boolean permiss�o � igual a permiss�o atual, poderia ser feito apenas com a vari�vel this.permissao
		if (permissao == false) { //Se a permiss�o for falsa ent�o imprima a mensagem de que o Funcion�rio n�o tem permiss�o para demitir
			System.out.println("\nO funcion�rio "+this.nome+" n�o tem permiss�o para demitir");
			return false; //return falso
		} else { //Sen�o (a permiss�o s� pode ser verdadeira) permiss�o for verdadeira ent�o imprima quem demitiu quem
			System.out.println("\nO funcion�rio "+this.nome+" demitiu o funcion�rio " +f.nome);
			return true; //retorne verdadeiro
		}
	}
	
	public String print(){
		String dados = "Nome: "+this.nome+
					   "\nDepartamento: "+this.depto+
					   "\nSal�rio: "+this.salario+
					   "\nData de Entrada: "+this.dataDeEntrada.formatada()+
					   "\nRG: "+this.rg;
		return dados;
	}

}
