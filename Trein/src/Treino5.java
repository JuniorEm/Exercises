
public class Treino5 {
	public static void main(String[] args) {
		int vetor[] = {15, 3, 12};
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) { //Se 9 for maior do que 7 então...
					int aux = vetor[j]; //Auxiliar recebe 7 que no caso é o menor
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		

 	}
}
