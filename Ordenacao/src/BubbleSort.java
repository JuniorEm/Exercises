

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] vetor = { 5, 3, 4, 5, 6 };
		int aux = 0;

		for (int i = 0; i < 5; i++) {
			for (int y = 0; y < 4; y++) {
				if (vetor[y] > vetor[y+1]) { //5 é maior do que 3? Sim, então...
					aux = vetor[y]; //Pega o 5
					vetor[y] = vetor[y+1]; //0 = 0+1
					vetor[y+1] = aux; // 0 + 1 = aux, o 5 trocou de posição com o 3!
				}
			}
		}
		
		System.out.println("Vetor ordenado: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("" + vetor[i]);
		}
	}
}

