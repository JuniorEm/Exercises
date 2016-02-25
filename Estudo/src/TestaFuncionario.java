
public class TestaFuncionario {
	public static void main(String[]args){
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		f1.nome = "Roman Sionis";
		f1.depto = "Criminologia Avançada";
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia = 05;
		f1.dataDeEntrada.mes = 06;
		f1.dataDeEntrada.ano = 1996;
		f1.salario = 15000;
		f1.rg = "12.123.345-1";
		f1.permissao = false;
		System.out.println(f1.mostra());
		

	}

}
