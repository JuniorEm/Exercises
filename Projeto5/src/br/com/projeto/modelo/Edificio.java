package br.com.projeto.modelo;

public class Edificio extends Imovel {
	private String cor;
	public static int cont;
	public static int cont2;
	private int[] andar = new int[20];
	
	//Constructors
	public Edificio(int size) {
		super(size); //Chamando o construtor da classe acima
	}
	
	//Methods
	
	public void adicionaAndar() {
		for (int i = 0; i < andar.length; i++) {
			if (andar[i] == 0) {
				andar[i] = Edificio.cont2++;
				break;
			}
		}
	}
	
	public int getTotalDeAndares() {
		return Edificio.cont2;
	}
	
	public int getTotalDePortas() {
		return Edificio.cont;
	}
	
	public String toString() {
		return "\n" +
				"\nTotal de Portas: " + getTotalDePortas() +
				"\nTotal de Andares: " + getTotalDeAndares();
	}



}
