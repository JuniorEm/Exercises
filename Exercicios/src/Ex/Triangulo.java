package Ex;

public class Triangulo implements calculoGeometrico{
	private double lado;
	private double base;
	private double altura;

	
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.base*altura;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
