import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		String[] arrayDeStrings = new String[10];
		
		for (int i = 0; i < arrayDeStrings.length; i++) {
			if (arrayDeStrings[i] == null) {
				arrayDeStrings[i] = "Olá";
		
			}
		}
		
		
		List<String> novaListStrings = new ArrayList<>(Arrays.asList(arrayDeStrings));
		System.out.println("Começo do List");
		for (int i = 0; i < novaListStrings.size(); i++) {
			if (novaListStrings.get(i) != null) {
				
				System.out.println(novaListStrings.get(i));
			}

		}
		System.out.println("Fim do List");
		
		System.out.println("Começo do Set");
		Set<String> novoSet = new HashSet<>(novaListStrings);
		Iterator iterator = novoSet.iterator();

		while (iterator.hasNext()) {
			String a = (String) iterator.next();
			if (a != null) {
				System.out.println(a);
			}
		}
		
		System.out.println("Fim do Set");
		
		System.out.println("Começo do Mapa");
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Arg");
		mapa.put(2, "Amz");
		mapa.put(3, "Jr");
		
		Set<Integer> novaSet = mapa.keySet(); //Não se repetem chaves
		
		
		for (int i = 0; i < mapa.size(); i++) {
			if (mapa.get(i) != null) {
				System.out.println(mapa.get(i));
			}
		}
		
		System.out.println("Fim do mapa");
		
		System.out.println(mapa.size());
		
	}
}
