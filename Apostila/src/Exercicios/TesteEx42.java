package Exercicios;

public class TesteEx42 {
	public static void main(String[] args){
		Porta porta = new Porta("Rosa", 20.0, 30.0, 40.0);
		System.out.println(porta.print());
		porta.pinta("azul");
		porta.abre();
		porta.estaAberta();
		porta.fecha();
		porta.estaAberta();
		porta.pinta("vermelho");
	}
}
