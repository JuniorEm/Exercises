
public class Funcionario {
	private String nome;
	private String ensino;
	public static int codigoFuncional;
	private double renda = 1000.00;

	// Constructors
	public Funcionario() {
		Funcionario.codigoFuncional++;
	}

	public Funcionario(String nome) {
		this();
		this.nome = nome;
	}
	
	public Funcionario(String nome, String ensino) {
		this(nome);
		this.ensino = ensino;
		this.verificaEnsino();
	}
	
	//Get & Set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEnsino(String ensino) {
		this.renda = 1000;
		this.ensino = ensino;
		this.verificaEnsino();
	}
	
	public String getEnsino() {
		return this.ensino;
	}
	
	public double getRenda() {
		return this.renda;
	}
	
	public double getComissao() {
		return this.getRenda();
	}
	
	//Methods
	public double acrescRendaEnsinoBasico() {
		return this.getRenda() + (this.getRenda() * 10/100); //2500 + (2500 * 10/100) => 2500 + 250 = 2750
	}
	
	public double acrescRendaEnsinoMedio() { 
		return this.acrescRendaEnsinoBasico() + (this.acrescRendaEnsinoBasico() * 50/100); //2750 + 2750 * 50/100 => 2500 + 1375 = 4125
	}
	
	public double acrescRendaGraduacao() {
		return this.acrescRendaEnsinoMedio() + (this.acrescRendaEnsinoMedio() * 100/100); // 4125 + 4125 * 100/100 = 6375
	}
	

	public String toString() {
		String dados = "\nNome: "+this.nome+
					"\nComissão: "+this.getComissao()+
					"\nSalário Total: "+this.getRenda();
		return dados;
	}
	
	public void verificaEnsino() {
		if (this.ensino == "basico") {
			this.renda = this.acrescRendaEnsinoBasico();
		} else {
			if (this.ensino == "medio") {
				this.renda = this.acrescRendaEnsinoMedio();
			} else {
				if (this.ensino == "graduacao") {
					this.renda = this.acrescRendaGraduacao();
				} else {
					System.out.println("O funcionário não tem nenhum ensino");
				}
			}
		}
	}
	
}
