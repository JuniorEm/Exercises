package Exercicios;

public class Porta {
	public boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	public static int cont;
	public static int cont1;
	
	//Constructors
	
	public Porta(){
		Porta.cont1++;
		
	}
	
	public Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ){
		this();
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	
	//Getters & Setters
	public String getCor(){
		return this.cor;
	}
	
	public double getDimensaoX(){
		return this.dimensaoX;
	}
	
	public double getDimensaoY(){
		return this.dimensaoY;
	}
	
	public double getDimensaoZ(){
		return this.dimensaoZ;
	}

	//Methods
	public void abre(){
		Porta.cont++;
		this.aberta = true;
	}
	
	public void fecha(){
		this.aberta = false;
	}
	
	public void pinta(String cor){
		this.cor = cor;
		System.out.println("A porta foi pintada de "+this.cor);
	}
	
	public boolean estaAberta(){
		boolean aberta = this.aberta;
		if (aberta==true){
			System.out.println("Está aberta!!!");
			return true;
		}
			System.out.println("Está fechada!!!");
			return false;
	}
	
	public String print(){
		String info = "\nCor: "+getCor()+
					"\nDimensão X: "+getDimensaoX()+
					"\nDimensao Y: "+getDimensaoY()+
					"\nDimensaoZ: "+getDimensaoZ();
		return info;
	}
	
	public static int getTotalAbertas(){
		return Porta.cont;
	}

}
