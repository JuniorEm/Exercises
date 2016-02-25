
public class Transporte {
	protected boolean ligado;
	protected double velocidade;

	// Constructors
	public Transporte() {
		// Empty Constructor
	}

	// Get & Set
	public void setVelocidade(double velocidade) {
		if (this.ligado == true) {
			if (velocidade >= 0) {
				this.velocidade = velocidade;
			} else {
				System.out.println("Velocidade não pode ser alterada por ser inválida!");
			}
		}
	}

	public double getVelocidade() {
		return this.velocidade;
	}

	// Methods
	public boolean liga() {
		return this.ligado = true;
	}

	public boolean desliga() {
		this.velocidade = 0;
		return this.ligado = false;
	}

}
