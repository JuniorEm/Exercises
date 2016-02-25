
public class Main {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Gerente g1 = new Gerente();
		f1.nome = "Funcionario 1";
		f1.empresa = "Blablabla";
		g1.nome = "Gerente 1";
		g1.empresa = "Empresa 1";
		
		System.out.println(f1);
		System.out.println(g1);
	}
}
