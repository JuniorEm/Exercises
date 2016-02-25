package br.com.unicamp.modelo;

public class CaminhaoBeta extends Caminhao {

	int cont1 = 0;
	int cont2 = 0;
	int cont3 = 0;
	

	public CaminhaoBeta(int quantidade, String tipo) {
		super(quantidade, tipo);
		this.pluviometro = new Pluviometro[(quantidade)];
	}
	
	public CaminhaoBeta(String tipo) {
		super(tipo);
		this.pluviometro = new Pluviometro[1000];
	}
	
	
	public void inserePluviometro(Pluviometro pluviometro) {
		for (int i = 0; i < this.pluviometro.length; i++) {
			if (this.pluviometro[i] == null) {
				if (pluviometro.getTipo().equalsIgnoreCase("Padr�o") && cont1 == 0) {
					this.pluviometro[i] = pluviometro;
					cont1++;
				} else {
					if (pluviometro.getTipo().equalsIgnoreCase("Bucket Pluvi�metro") && cont2 == 0) {
						this.pluviometro[i] = pluviometro;
						cont2++;
					} else {
						if (pluviometro.getTipo().equalsIgnoreCase("Pluvi�metro �ptico") && cont3 == 0) {
							this.pluviometro[i] = pluviometro;
							cont3++;
						}
					}
				}
			}
		}
	}

}
