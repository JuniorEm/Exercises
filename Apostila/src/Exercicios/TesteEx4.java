package Exercicios;

public class TesteEx4 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Coringa", 35);
		System.out.println(pessoa.print());
		pessoa.fazAniversario();
		System.out.println("Idade atual: "+pessoa.getIdade()+" anos");
	}

}
