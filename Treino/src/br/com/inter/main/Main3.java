package br.com.inter.main;

public class Main3 {
	
	
	public static void exemploException(int x) {
		if (x < 5) {
			//Sua lógica
		} else {
			throw new RuntimeException("Ops! o x é maior do que o 5!");
		}
	}
	
	public static void main(String[] args) {
		Main3.exemploException(6);
	}
}
