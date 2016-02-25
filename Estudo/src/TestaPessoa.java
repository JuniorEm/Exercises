
public class TestaPessoa {
	public static void main(String[] args){
		Pessoa pessoa = new Pessoa("Marta", 37);
		System.out.println("Era uma vez "+pessoa.nome+" que tinha "+pessoa.idade+" anos");
		System.out.println("Mas ela fez aniversário");
		pessoa.fazAniversario();
		System.out.println(pessoa.mostra());
		System.out.println("Passou-se mais um ano e "+pessoa.nome+" ficou mais velha");
		pessoa.fazAniversario();
		System.out.println(pessoa.mostra());
	}

}
