
//Exponenciação
public class Logica3 {
	
	
	public int geraExpoente(int numero, int expoente) {
		int aux = 1;
		
		for (int i = 0; i < expoente; i++) {
			aux = aux * numero;
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		Logica3 logica = new Logica3();
		System.out.println(logica.geraExpoente(9, 3));
	}
}
