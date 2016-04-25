
public class ImplementaAnimal implements Animal {
	private String nomeEspecie;
	private String nomeAnimal;
	private Animal[] animal;
	
	public ImplementaAnimal() {
		animal = new Animal[30];
	}
	
	public ImplementaAnimal(String nomeEspecie, String nomeAnimal) {
		this();
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
	}
	
	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void adicionaAnimal(Animal animal) {
		for (int i = 0; i < this.animal.length; i++) {
			if (this.animal[i] == null) {
				this.animal[i] = animal;
				break;
 			}
		}
	}
	
	public Animal[] getList() {
		return animal;
	}
	
	public static Resultado[] questOne(Animal[] completo, Ferramentas ferramenta) {
		Animal[] novoCompleto = completo.clone();
		Animal[] novoArray = new Animal[10];
		String[] classifica = ferramenta.classificaEspecies(novoCompleto);
		int quantidade = 0;
		int[] quantidadeArray = new int[completo.length];
		
		
		for (int i = 0; i < completo.length; i++) {
			novoArray = ferramenta.filtraEspecie(completo, classifica[i]);
			quantidade = 0;
			for (int y = 0; y < novoArray.length; y++) {
				if (novoArray[y] != null) {
					quantidade++;
				}
			}
			
			
			for (int u = 0; u < quantidadeArray.length; u++) {
				if (quantidadeArray[u] == 0) {
					quantidadeArray[u] = quantidade;
					break;
				}
			}
			
			
			novoArray = null;
		}
		
	
		
		
		Resultado[] resultado = new Resultado[completo.length];
		
		for (int i = 0; i < resultado.length; i++) {
			if (resultado[i] == null) {
				resultado[i] = new Resultado(classifica[i], quantidadeArray[i]);
			}
		}
		
		
		
		return resultado;
	}
}
