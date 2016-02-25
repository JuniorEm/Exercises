package br.com.formula.logica;

public class Modularizado {
	double raio;
	int aux;
	int result = 1;
	
	public double media (double x, double y, double z) {
		return (x + y + z) / 3;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calculaVolume () {
		return (4.0/3.0) * 3.1415 * this.getRaio() * this.getRaio() * this.getRaio();
	}
	
	public int calculaPotencia(int base, int expoente) {   //2, 3
		while (aux < expoente) { //Enquanto 0 < 3 - Enquanto 1 < 3 - Enquanto 2 < 3
			result = result * base;  //1 = 1 * 2; - 2 = 2 * 2 - 4 = 4 * 2
			aux++; //0 virou 1 - 1 virou 2 - 2 iria virar 3 sai do loop e retorna o resultado
		}
			return result;
	}
	
	public static int somaEstatica(int x, int z, int a) {
		return (x + z + a);
	}
	

	

}
