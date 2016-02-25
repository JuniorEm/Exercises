import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Treino {
	public static void main(String[] args) {
		List<String> umaLista = new ArrayList<String>();
		umaLista.add("MariaDB");
		umaLista.add("InnoDB");
		umaLista.add("BlackHole Engine");
		umaLista.add("MyIsam");
		umaLista.add("This is MySQL");
		umaLista.add("PLSQL");
		umaLista.remove("This is MySQL");
		
		for (int i = 0; i<umaLista.size(); i++) {
			System.out.println(umaLista.get(i));
		}
		//imprime("Após adicionar os primeiros elementos", umaLista);
		


	}
	

	  /*public static void imprime(String titulo, Collection<String> collection) {  
	      //System.out.println();  
	      System.out.println("\n"+titulo + ":");  
	      for (String str : collection) {  
	         System.out.println(str);  
	      }  
	      System.out.println();  
	   }  */


}
