package Ex;

public class testaFigura {
	public static void main(String[] args){
		Quadrado qd1 = new Quadrado(5);
		System.out.println("Área: " +qd1.calculaArea());
		System.out.println("Perímetro: " +qd1.calculaPerimetro());
		System.out.println("Identificador: "+qd1.getTotal());
		
		Quadrado qd2 = new Quadrado(6);
		System.out.println("\nÁrea: " +qd2.calculaArea());
		System.out.println("Perímetro: " +qd2.calculaPerimetro());
		System.out.println(qd2.getTotal());
		
		Triangulo tg1 = new Triangulo(5, 4);
		System.out.println("\nÁrea: " +tg1.calculaArea());
	} 

}
