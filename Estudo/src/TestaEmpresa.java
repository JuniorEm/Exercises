
public class TestaEmpresa {
	public static void main(String[] args) {
		Data data = new Data();
		Empresa empresa = new Empresa();
		empresa.nome = "ACME do Brasil";
		Empresa empresa2 = new Empresa();
		empresa2.nome = "VASP";
		//empresa.funcionarios = new Funcionario[10];
		Funcionario f1 = new Funcionario();
		f1.nome = "Jonathan Crane";
		f1.depto = "Psiquiatria";
		f1.salario = 25000;
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia = 18;
		f1.dataDeEntrada.mes = 7;
		f1.dataDeEntrada.ano = 1999;
		f1.rg = "12.123.456-x";
		f1.calculaGanhoAnual();
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		Data data2 = new Data();
		f2.nome = "Oswald Cobblepot";
		f2.depto = "Criminologia";
		f2.salario = 150000;
		f2.dataDeEntrada = data2;
		f2.dataDeEntrada.dia = 9;
		f2.dataDeEntrada.mes = 9;
		f2.dataDeEntrada.ano = 1991;
		f2.rg = "99.999.999-9";
		f2.calculaGanhoAnual();
		empresa.adiciona(f2);
		
		
		for (int i=0; i<3; i++){
			Data data3 = new Data();
			Funcionario f = new Funcionario();
			f.nome = "Example";
			f.dataDeEntrada = data3;
			f.dataDeEntrada.dia = i;
			f.dataDeEntrada.mes = i;
			f.dataDeEntrada.ano = 2000+i;
			empresa.adiciona(f);
		}

		Data data4 = new Data();
		empresa.funcionarios[5] = new Funcionario();
		empresa.funcionarios[5].nome = "Edward Nigma";
		empresa.funcionarios[5].dataDeEntrada = data4;
		empresa.funcionarios[5].dataDeEntrada.dia = 15;
		empresa.funcionarios[5].dataDeEntrada.mes = 05;
		empresa.funcionarios[5].dataDeEntrada.ano = 1993;
		
		empresa.mostra();
		
		empresa.contem(f2);
	}

}
