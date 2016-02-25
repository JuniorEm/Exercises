package Ex;

public class Quadrado implements calculoGeometrico {
	private double lado;
	private static int contadorGlobal;
	private int identificador;
	
	public Quadrado(){
		
	}
	public Quadrado(int lado){
		Quadrado.contadorGlobal++;
		this.lado = lado;
		this.identificador = contadorGlobal;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		this.lado = lado;
		return this.lado*4;
	}
	
	public double getTotal(){
		return Quadrado.contadorGlobal++;
	}


	

}
