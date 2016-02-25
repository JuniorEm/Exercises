
public class TestaFornecedor {
	public static void main(String[] args){
		Pessoa p = new Pessoa("Maresias", "Rodovia Ayrton Senna", "3333-3333");
		System.out.println(p.mostra());
		Fornecedor f = new Fornecedor("Jadiel", "Rua das Rabeiras", "1234-5678", 15000, 3000);
		System.out.println(f.mostra());
		Fornecedor e = new Fornecedor("Elaine", "Rua de Exemplo", "3906-4344", 16000, 2000);
		System.out.println(e.mostra());
	}


}
