
public class Treino3 {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 3, 4, 5, 5, 6 };
		
		for (int i = 0; i < x.length - 1 ; i++) {
			if (x[i] == x[i+1]) {
				System.out.println("É igual");
			} else {
				System.out.println("É diferente!");
			}
		}
	}
}
