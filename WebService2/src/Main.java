import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		ClienteWebService cliente = new ClienteWebService();
		
		Cidades listCidades = cliente.getCidades(); //como eu sei que é uma coleção
		//então eu pego essa coleção dando um "list"
		//Ele pode efetuar casting de Cidades para getList por causa do implicitCollections

		List<Cidade> novaList = listCidades.getCidadeList();
		
		for (Cidade cidade : novaList) {
			System.out.println("\nID: " + cidade.getId());
			System.out.println("UF: " + cidade.getUf());
			System.out.println("Nome: " + cidade.getNome());
		}
		
		
	}
}
