
public class Quadrado {
	private double lado;
	
	//Constructors
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	//Get & Set
	
	
	//Methods
	public double area(){
		return this.lado*this.lado;
	}
	
	public double perimetro(){
		return this.lado*4;
	}

}
