package Ex;

public class testaFigura {
	public static void main(String[] args){
		Quadrado qd1 = new Quadrado(5);
		System.out.println("�rea: " +qd1.calculaArea());
		System.out.println("Per�metro: " +qd1.calculaPerimetro());
		System.out.println("Identificador: "+qd1.getTotal());
		
		Quadrado qd2 = new Quadrado(6);
		System.out.println("\n�rea: " +qd2.calculaArea());
		System.out.println("Per�metro: " +qd2.calculaPerimetro());
		System.out.println(qd2.getTotal());
		
		Triangulo tg1 = new Triangulo(5, 4);
		System.out.println("\n�rea: " +tg1.calculaArea());
	} 

}
