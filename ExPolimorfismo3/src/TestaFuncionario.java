

public class TestaFuncionario {
	public static void main(String[] args) {
		ArrayFuncionario af = new ArrayFuncionario(10);
		
		Gerente g1 = new Gerente("Daniel", "graduacao");
		Gerente g2 = new Gerente("Junior fodão", "graduacao");
		
		Supervisor s1 = new Supervisor("Jiripoca", "medio");
		Supervisor s2 = new Supervisor("Ricardo Passos", "graduacao");
		
		Vendedor v1 = new Vendedor("Jararaca", "basico");
		Vendedor v2 = new Vendedor("Gaynardo Gaydrigues", "basico");
		Vendedor v3 = new Vendedor("Caio Gay", "medio");
		Vendedor v4 = new Vendedor("Josicleyson", "basico");
		Vendedor v5 = new Vendedor("Mimica", "medio");
		Vendedor v6 = new Vendedor("Eduarda", "medio");
		Vendedor v7 = new Vendedor("Datena fdp", "basico");
		
		
		
		
		af.cadastra(g1);	
		af.cadastra(s1);
		af.cadastra(s2);
		af.cadastra(v1);
		af.cadastra(v2);
		af.cadastra(v3);
		af.cadastra(v4);
		af.cadastra(v5);
		af.cadastra(v6);
		af.cadastra(v7);
		
		
		
		
		af.mostra();
	}

}
