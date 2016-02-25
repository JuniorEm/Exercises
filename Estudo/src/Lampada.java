
public class Lampada {
	private boolean ligada;
	
	//Constructors
	public Lampada(){
		//EMPTY CONSTRUCTOR
	}
	
	//Get & Set
	
	//Methods
	public void liga(){
		this.ligada = true;
	}
	
	public void desliga(){
		this.ligada = false;
	}
	
	public String observa(){
		String info;
		if (this.ligada==true){
			return info="Ligada";
		}
			return info="Desligada";
	}
}
