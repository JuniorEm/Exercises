
public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	// Constructors
	public Produto() {
		// Empty Constructor
	}

	// Get & Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoCusto() {
		return this.precoCusto;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
		if (this.precoVenda < this.precoCusto) {
			System.out.println("Alerta! O preço de venda é menor que o preço de compra!");
		}
	}

	public double getPrecoVenda() {
		return this.precoVenda;
	}

	public double getMargemLucro() {
		return this.margemLucro;
	}

	// Methods
	public void calculaMargemLucro() {
		this.margemLucro = this.precoVenda - this.precoCusto;
	}

	public double getMargemLucroPercentual() {
		return (this.margemLucro / this.precoCusto) * 100;
	}

}
