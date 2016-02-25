package Examples;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
	public static void main(String[] args){
		List<ContaCorrente> ccorrente = new ArrayList<>();
		Cliente cliente = new Cliente("Tadeu", "01/03/2015");
		ContaCorrente cc1 = new ContaCorrente(5000, 5000);
		cc1.titular = cliente; //Copiando a referência da variável titular para a instância do cliente
		/*cc1.titular.nome = "Tadeu";
		cc1.titular.dataDeCriacao = "01/03/2015";*/
		System.out.println(cc1.print());
		ContaCorrente cc2 = new ContaCorrente(6000, 6000);
		ContaCorrente cc3 = new ContaCorrente(7000, 7000);
		ContaCorrente cc4 = new ContaCorrente(8000, 8000);
		ccorrente.add(cc1);
		ccorrente.add(cc2);
		ccorrente.add(cc3);
		ccorrente.add(cc4);

		for (int i = 0; i<ccorrente.size(); i++){
			ContaCorrente cc = ccorrente.get(i);
			System.out.println(cc.getSaldo());
			
		}
		
			cc1.transfere(cc2, 8000);
		
			for (int i = 0; i<ccorrente.size(); i++){
				ContaCorrente cc = ccorrente.get(i);
				System.out.println(cc.getSaldo());
				
			}

		
	}

}
