//Fatorial

public class Logica4 {
	
	public int calculaFatorial(int numero) {
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) { //Para i igual a 1 até que i seja menor ou igual ao numero passado, i++
			fatorial = fatorial * i; //1 = 1 * 1; 1 = 1 * 2; 2 = 2 * 3; 6 = 6 * 4; etc...
		}
		
		return fatorial;
	}
	
	
	public static void main(String[] args) {
		Logica4 logica = new Logica4();
		System.out.println(logica.calculaFatorial(3));
	}
}
