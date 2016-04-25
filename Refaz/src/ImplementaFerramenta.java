
public class ImplementaFerramenta implements Ferramentas {


	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		Animal[] oldArray = new Animal[completo.length];
		Animal[] newArray;
		
		int contador = 0;
		
		for (int i = 0; i < completo.length; i++) {
			if ((completo[i] != null) && (completo[i].getNomeEspecie().equals(especieFiltrar))) {
				for (int y = 0; y < oldArray.length; y++) {
					if (oldArray[y] == null) {
						oldArray[y] = completo[i];
						contador++;
						break;
					}
				}
			}
		}
		

		newArray = new Animal[contador];
						
		for (int i = 0; i < oldArray.length; i++) {	
			for (int y = 0; y < newArray.length; y++) {
				if ((oldArray[i] != null) && (newArray[y] == null)) {
					newArray[y] = oldArray[i];
				}
			}
		}
		
		return newArray;
	}


	public String[] classificaEspecies(Animal[] completo) {
		
		for (int i = 0; i < completo.length; i++) {
			for (int y = 0; y < completo.length; y++) {
				if (i != y) {
					if ((completo[i] != null) && (completo[y] != null) && (completo[i].getNomeEspecie() == completo[y].getNomeEspecie())) {
						completo[i] = null;
					}
				}
			}
		} 
		
		
		String[] novoString = new String[completo.length];
		
		for (int i = 0; i < completo.length; i++) {
			if (completo[i] != null) {
				for (int u = 0; u < novoString.length; u++) {
					if (novoString[u] == null) {
						novoString[u] = completo[i].getNomeEspecie();
						break;
					}
				}
			}
		}
		
		return novoString;
	}
	
}
