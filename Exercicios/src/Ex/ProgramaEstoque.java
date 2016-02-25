package Ex;

public class ProgramaEstoque {
	public static void main(String[] args) {

		Estoque est = new Estoque("Telefone Celular", 300, 100);
		est.darBaixa(200);
		System.out.println(est.printInScreen());
		System.out.println(est.precisaRepor());
		est.repor(600);
		System.out.println("\n"+est.printInScreen());
		System.out.println(est.precisaRepor());
		
	}

}
