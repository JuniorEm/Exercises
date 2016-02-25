
public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	
	//Constructors
	public Estoque(){
		//EMPTY CONSTRUCTOR
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima){
		this();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	//Get & Set
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getQtdAtual(){
		return this.qtdAtual;
	}
	
	public void setQtdMinima(int qtdMinima){
		this.qtdMinima = qtdMinima;
	}
	
	public int getQtdMinima(){
		return this.qtdMinima;
	}
	
	//Methods
	public void repor(int quantidade){
		this.qtdAtual = this.qtdAtual + quantidade;
	}
	
	public void darBaixa(int quantidade){
		this.qtdAtual = this.qtdAtual - quantidade;
	}
	
	public boolean precisaRepor(){
		if (this.qtdMinima>=this.qtdAtual){
			return true;
		}
			return false;
	}
	
	public String mostra(){
		String dados = "\nNome: "+this.nome+
						"\nQuantidade Atual: "+this.qtdAtual+
						"\nQuantidade Mínima: "+this.qtdMinima+
						"\nPrecisa repor?: "+this.precisaRepor();
		return dados;
	}

}
