package Exercicios;

public class TestaFuncionario {
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		f1.nome = "Batman";
		f1.depto = "Tecnologia da Informação";
		f1.rg = "36.627.483-1";
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia = 1;
		f1.dataDeEntrada.mes = 10;
		f1.dataDeEntrada.ano = 2015;
		f1.salario = 15000;
		f1.permissao = true; //O this.permissao na classe Funcionario faz o método olhar para quem vai invocá-lo, 
		//se no método for escrito f.permissao então ele vai olhar para quem foi passado como parâmetro o que é errado
		
		System.out.println(f1.print());
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Coringa";
		f2.depto = "Logística";
		f2.rg = "12.123.456-3";
		f2.dataDeEntrada.dia = 2;
		f2.dataDeEntrada.mes = 9;
		f2.dataDeEntrada.ano = 2015;
		f2.salario = 50000;
		f2.permissao = false;
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Batman";
		f3.depto = "Tecnologia da Informação";
		f3.rg = "36.627.483-1";
		f3.dataDeEntrada.dia = 1;
		f3.dataDeEntrada.mes = 9;
		f3.dataDeEntrada.ano = 2015;
		f3.salario = 15000;
		f3.permissao = true;
		

		
		//f1.demite(f2);
		
		f1 = f3;
		
		if (f1==f3){
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		
	}
	

}
