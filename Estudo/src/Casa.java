
public class Casa {
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	//Constructors
	
	//Get & Set
	
	//Methods
	
	public void pinta(String cor){
		this.cor = cor;
	}
	
	public int quantasPortasEstaoAbertas(){
		return Porta.cont;
	}
	
	public String mostra(){
		String info = "\nCor: "+this.cor+
				"\nQuantas portas estão abertas: "+this.quantasPortasEstaoAbertas();
		return info;
	}

}
