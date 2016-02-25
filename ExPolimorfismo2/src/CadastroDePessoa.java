
public class CadastroDePessoa {
	Pessoa[] pessoa;
	private int qtdAtual;
	
	
	//Constructors
	public CadastroDePessoa(){
		this.pessoa = new Pessoa[100];
	}
	
	public CadastroDePessoa(int size) {
		this.pessoa = new Pessoa[size];
	}
	
	//Get & Set
	
	//Methods
	public void cadastraPessoa(Pessoa p) {
		for (int i = 0; i<pessoa.length; i++) {
			if (pessoa[i] == null) {
				pessoa[i] = p;
				break;
			}
		}
	}
	
	public void imprimeCadastro() {
		for (Pessoa i : this.pessoa) {
			if (i!=null) {
				System.out.println(i.imprimeDados());
				this.qtdAtual++;
			}
			
		}
			System.out.println("\nTotal de Cadastros: "+this.qtdAtual);
	}

}
