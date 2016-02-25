package br.com.exercicio.modelo;

public abstract class Quadrilatero implements FormaGeometrica {
	float lado1, lado2, lado3, lado4;
	
	public Quadrilatero(float lado1, float lado2, float lado3, float lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	

	@Override
	public float calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public float calculaPerimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + lado3 + lado4;
	}
	
}
