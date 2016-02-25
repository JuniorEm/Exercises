
public class Zoologico {
	Animal jaula[];
	
	//Constructor
	
	public Zoologico() {
		this.jaula = new Animal[10];
	}
	
	//Get & Set
	
	//Methods
	public void colocaEmJaula(Animal animal) {
		for (int i = 0; i<jaula.length; i++) {
			if (jaula[i] == null) {
				jaula[i] = animal;
				break;
			}
		}
	}
	
	public void percorrerJaula(){
		for (Animal i: jaula){
			if (i!=null){
				System.out.println(i.emiteSom());
			}
		}
	}
	
	
	

}
