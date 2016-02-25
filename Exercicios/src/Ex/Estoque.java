package Ex;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	// Constructors
	public Estoque() {
		// Não recebe nenhum parâmetro
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	// Getters & Setters
	public void setNome(String nome) { // Mudar Nome
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public int getQtdMinima() {
		return this.qtdMinima;
	}

	// Methods
	public void repor(int qtd) {
		this.qtdAtual = this.qtdAtual + qtd;
	}
	
	public void darBaixa(int qtd) {
		this.qtdAtual = this.qtdAtual - qtd;
	}
	
	public boolean precisaRepor(){
		if (this.qtdAtual<=qtdMinima){
			return true;
		}
			return false;
	}
	
	public String printInScreen(){
		String dados = "\nNome do Produto: "+this.nome+
				"\nQuantidade Atual: "+this.qtdAtual+
				"\nQuantidade Minima: "+this.qtdMinima;
		return dados;
		
	}
}
