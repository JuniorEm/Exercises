package br.com.inter.model;

public class Cor {

	public static final int VERMELHO = 1, AZUL = 2, ROXO = 3, VERDE = 4, AMARELO = 5, CIANO = 6, BRANCO = 7;
	
	
	private static boolean corValida(int cor) {
		return cor == VERMELHO || cor == AZUL || cor == ROXO || cor == VERDE || cor == AMARELO || cor == CIANO || cor == BRANCO;
	}
	
	
	public static final int corCombina(int cor1, int cor2) {
		if (!corValida(cor1)) return -1; //Se a cor1 não é válida, retorne -1...
		if (!corValida(cor2)) return -1; //Se a cor2 não é válida, retorne -1...
		
		return cor1 |cor2; //Operador Binário 
		/* 
		 Já o operador | é o "OU binário", ele mescla os bits dos parâmetros desta forma:

0 | 0 = 0 
0 | 1 = 1 
1 | 0 = 1 
1 | 1 = 1 
A lógica é a mesma do || (qualquer dos lados sendo verdadeiro, resulta em verdadeiro), mas se aplica aos bits individuais de cada um dos parâmetros. Como exemplo, 3 | 5 resulta em 7, pois 3 é 0011 em binário, e 5 é 0101:
		 */
	}

}
