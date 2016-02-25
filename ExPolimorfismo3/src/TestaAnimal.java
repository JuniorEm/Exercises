
public class TestaAnimal {
	public static void main(String[] args) {
		Zoologico zoologico = new Zoologico();
		
		Cavalo c1 = new Cavalo("Ribanceira", 10);
		System.out.println(c1.emiteSom());
		
		Cachorro ca1 = new Cachorro("Bob", 2);
		System.out.println(ca1.emiteSom());
		
		Preguica pr1 = new Preguica("Mimi", 3);
		System.out.println(pr1.emiteSom());
		
		Veterinario v1 = new Veterinario();
		v1.examina(ca1);
		
		zoologico.colocaEmJaula(ca1);
		zoologico.colocaEmJaula(pr1);
		zoologico.percorrerJaula();
		
		
	}
}
