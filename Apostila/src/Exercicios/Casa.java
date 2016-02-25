package Exercicios;

public class Casa {
	private String cor;
	public Porta porta[];
	public static int cont;
	
	//Constructors
	public Casa(){
		
	}
	
	public Casa(String cor){
		this();
		this.cor = cor;
	}
	
	//Get & Set
	public String getCor(){
		return this.cor;
	}
	
	//Methods
	public void pinta(String cor){
		this.cor = cor;
		System.out.println("A casa foi pintada de "+this.cor);
	}
	
	public int quantasPortasEstaoAbertas(){
		return Porta.getTotalAbertas();
	}
	
	public void adicionaPorta(Porta p){
		for (int i = 0; i<this.porta.length; i++){
			if (this.porta[i]==null){
				this.porta[i] = p;
				break;
			}
		}
	}
	
	public void mostraPorta(){
		for (Porta i: porta){
			if (i!=null){
				System.out.println(i.print());
			}
		}
	}
	
	public int totalDePortas(){
		if (Porta.cont1>this.porta.length){
			throw new IndexOutOfBoundsException();
		} else {
			return Porta.cont1;
		}
	}
}
