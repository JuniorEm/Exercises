package br.com.unicamp.modelo;

public class CaminhaoAlfa extends Caminhao {

	int aux = 0;
	
	public CaminhaoAlfa(int quantidade, String tipo) {
		super(quantidade, tipo);
		this.pluviometro = new Pluviometro[quantidade];
	}

	public CaminhaoAlfa(String tipo) {
		super(tipo);
		this.pluviometro = new Pluviometro[1000];
	}
	
	public void inserePluviometro(Pluviometro pluviometro) {
		for (int i = 0; i < this.pluviometro.length; i++) {
			if (this.pluviometro[i] == null) {
				if (aux <= 5000) {
					this.pluviometro[i] = pluviometro;
					aux = aux + this.pluviometro[i].getPeso();
					break;
				} else {
					System.out.println("Capacidade não suportada!");
					break;
				}
			}

		}
	}
	

	
	
}
