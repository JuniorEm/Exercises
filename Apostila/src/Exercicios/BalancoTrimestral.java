package Exercicios;

public class BalancoTrimestral {
	public static void main(String[] args) {
		double gastosJaneiro = 15000;
		double gastosFevereiro = 23000;
		double gastosMarco = 17000;
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = (int) gastosTrimestre/3; //cast - Tem como fun��o transformar o tipo da vari�vel - 
		//No caso temos um double para um int
		
		System.out.println("Gastos Trimestrais: "+gastosTrimestre+" M�dia Mensal: "+mediaMensal);  
	}

}
