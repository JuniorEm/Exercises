package Exercicios;

public class TestaEmpresa {
	public static void main(String[] args) {
			Empresa empresa = new Empresa("MariaDB", "12345434/000-1");
			empresa.funcionario = new Funcionario[11];
			Funcionario f1 = new Funcionario();
			Data data = new Data();
			f1.nome = "Batman, o Cavaleiro das Trevas";
			f1.depto = "Tecnologia da Informação";
			f1.rg = "36.627.483-1";
			f1.salario = 1500000;
			f1.permissao = true;
			f1.dataDeEntrada = data;
			f1.dataDeEntrada.dia = 5;
			f1.dataDeEntrada.mes = 6;
			f1.dataDeEntrada.ano = 1996;
			empresa.adiciona(f1);
			
			Funcionario f2 = new Funcionario();
			f2.nome = "Coringa";
			f2.depto = "Logística";
			f2.rg = "12.123.456-3";
			f2.dataDeEntrada = data;
			f2.dataDeEntrada.dia = 2;
			f2.dataDeEntrada.mes = 9;
			f2.dataDeEntrada.ano = 2015;
			f2.salario = 50000;
			f2.permissao = false;
			empresa.adiciona(f2);
			
			for (int i = 0; i<5; i++){
				Funcionario f = new Funcionario();
				Data date = new Data();
				f.nome = "Amadeu n°"+i;
				if (i==1){
				f.depto = "Logística";
				f.salario = 18000;
				} else {
					if (i==3){
						f.depto = "Administração";
						f.salario = 12000;
					} else {
						f.depto = "RH";
						f.salario = 8000;
					}
				}
				f.dataDeEntrada = date;
				f.dataDeEntrada.dia = +i;
				f.dataDeEntrada.mes = +i;
				f.dataDeEntrada.ano = 2000+i;
				empresa.adiciona(f);	
			}
			
			empresa.print();
	}

}
