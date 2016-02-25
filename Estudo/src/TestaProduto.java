
public class TestaProduto {
	public static void main(String[] args){
		Produto p1 = new Produto();
		p1.setNome("Balinha");
		p1.setPrecoCusto(0.50);
		p1.setPrecoVenda(0.60);
		p1.calculaMargemLucro();
		System.out.println(p1.getNome());
		System.out.println(p1.getPrecoCusto());
		System.out.println(p1.getPrecoVenda());
		System.out.println(p1.getMargemLucro());
		System.out.println(p1.getMargemLucroPercentual());
	}

}
