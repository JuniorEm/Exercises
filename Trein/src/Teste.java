


public class Teste {

	
	public static double virgula (double x, double y) {
		System.out.println("É um Double!");
		return x * y;
	}
	
	public static int virgula (int x, int y) {
		System.out.println("É um Inteiro!");
		return x * y;
	}
	
	public static void main(String[] args) { //Sobrecarregando método
		System.out.println(virgula(5.5,2));
		
		
	}

}
