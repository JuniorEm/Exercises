
public class Carro extends Transporte {
	private double quilometragem;

	// Constructors
	public Carro() {
		super();
	}

	// Get & Set
	public void setQuilometragem(double quilometragem) {
		if (quilometragem >= 0 && quilometragem <= 999999) {
			this.quilometragem = quilometragem;
		}
	}

	public double getQuilometragem() {
		return this.quilometragem;
	}

	public void setVelocidade(double velocidade) {
		if (this.ligado == true) {
			if (velocidade >= 0 & velocidade <= 200) {
				this.velocidade = velocidade;
			}

		}
	}

	// Methods
}
