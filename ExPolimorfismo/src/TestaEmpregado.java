import java.util.ArrayList;
import java.util.List;

public class TestaEmpregado {
	public static void main(String[] args) {
		Empregado e1 = new Empregado("Ailton", "Rua dos Alfeneiros", "1234-5678", 20000, 8008, 5750.0);
		System.out.println(e1.mostra());

		Pessoa p1 = new Pessoa("Amarildo Costa", "Rua dos Babacões", "6969-6969");
		System.out.println(p1.mostra());

		Administrador d1 = new Administrador("Marilson", "Rua SQL SERVER é bom", "1233-4333", 15000, 8004, 3500, 4000);
		System.out.println(d1.mostra());

		Empregado e2 = new Empregado();
		System.out.println(e1.mostra());

		Operario o1 = new Operario("Josicrebson", "Rua Java é o melhor", "3544-4553", 2500, 8002, 1500, 1200, 900);
		System.out.println(o1.mostra());

		Vendedor v1 = new Vendedor("Mário", "C# é bom", "4333-3333", 3000, 2121, 633.95, 2500, 1200);
		v1.setComissao(750.0);
		System.out.println(v1.mostra());

		if (d1 instanceof Empregado) {
			System.out.println("\n" + d1.nome + " é um Empregado");
		} else {
			System.out.println("\n" + d1.nome + " não é um Empregado");
		}
		
		if (v1 instanceof Empregado) {
			System.out.println("\n" + v1.nome + " é um Empregado");
		} else {
			System.out.println("\n" + v1.nome + " não é um Empregado");
		}
		
		
		
	}


}



