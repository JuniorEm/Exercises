package br.com.exercicio.modelo;

public class Figura extends Quadrilatero {

	float maior = (float) 0.0;
	float menor = 100;
	
	public Figura(float lado1, float lado2, float lado3, float lado4) {
		super(lado1, lado2, lado3, lado4);
		// TODO Auto-generated constructor stub
	}


	@Override
	public float calculaArea() {
		// TODO Auto-generated method stub //30, 50, 40, 35
		if (lado1 > maior) { //Se 30 for maior do que 0
			maior = lado1; //Ent�o maior � igual a 30
		}

		if (lado1 < menor) {  //Se 30 for menor do que 100
			menor = lado1;  //Ent�o o menor � igual a 30
		}
		
		if (lado2 > maior) { //Se 50 for maior do que 30 - TRUE
			maior = lado2; //Ent�o maior � igual a 50
		} 
		
		if (lado2 < menor) { //Se 50 for menor do que 30
			menor = lado2;  //Ent�o nem isso ele faz, porque 50 n�o � menor do que 30
		}
		
		if (lado3 > maior) { //Se 40 for maior do que 50
			maior = lado3; //N�o �, ent�o ele nem atribui
		} 
		
		if (lado3 < menor) { //Se 40 for menor do que 30
			menor = lado3; //40 n�o � menor, ent�o nem atribui
		}
		
		if (lado4 > maior) { //35 � maior do que 50?
			maior = lado4; //N�o, ent�o ele nem atribui
		} 
		
		if (lado4 < menor) { //35 � menor do que 30?
			menor = lado4; //N�o, ent�o ele nem atribui
		}
			//Maior = 50, e o Menor = 30 * 1500 Multiplicar o maior lado pelo menor lado
		return maior * menor;
	}

}
