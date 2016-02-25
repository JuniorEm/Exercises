
public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	static int cont;
	
	//Constructors
	
	//Get & Set
	
	//Methods
	
	public void abre(){
		this.aberta = true;
		Porta.cont++;
	}
	
	public void fecha(){
		this.aberta = false;
	}
	
	public void pinta(String cor){
		this.cor = cor;
	}
	
	public boolean estaAberta(){
		if (this.aberta==true){
			System.out.println("Est� aberta!");
			return true;
		} else {
			System.out.println("Est� fechada!");
			return false;
		}
	}
	
	public String mostra(){
		String info = "\nDimens�o X: "+this.dimensaoX+
					"\nDimens�o Y: "+this.dimensaoY+
					"\nDimensao Z: "+this.dimensaoZ+
					"\nCor: "+this.cor;
		return info;
	}
	

}
