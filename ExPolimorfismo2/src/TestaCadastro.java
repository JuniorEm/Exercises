
public class TestaCadastro{
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Harvey Dent", 3);
		Data data = new Data();
		c1.nascimento = data;
		c1.nascimento.setDia(5);
		c1.nascimento.setMes(6);
		c1.nascimento.setAno(1995);
		
		Cliente c2 = new Cliente("Bane", 4);
		Data data2 = new Data();
		c2.nascimento = data2;
		c2.nascimento.setDia(9);
		c2.nascimento.setMes(4);
		c2.nascimento.setAno(1992);
		
		Funcionario f1 = new Funcionario("Oswald Cobblepot", 120000);
		Data data3 = new Data();
		f1.nascimento = data3;
		f1.nascimento.setDia(16);
		f1.nascimento.setMes(05);
		f1.nascimento.setAno(1994);
		
		Gerente g1 = new Gerente("Daniel Green", 1500000, "Gerente de T.I");
		Data data4 = new Data();
		g1.nascimento = data4;
		g1.nascimento.setDia(25);
		g1.nascimento.setMes(06);
		g1.nascimento.setAno(1985);
		
		
		CadastroDePessoa cdp1 = new CadastroDePessoa();
		cdp1.cadastraPessoa(c1);
		cdp1.cadastraPessoa(c2);
		cdp1.cadastraPessoa(f1);
		cdp1.cadastraPessoa(g1);
		cdp1.imprimeCadastro();
		
		
	}

}
