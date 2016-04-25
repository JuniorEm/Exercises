import java.util.ArrayList;

public class TagFora {
	private Person[] person;
	
	
	public TagFora() {
		this.person = new Person[10];
	}
	
	public void adiciona(Person person) {
		for (int i = 0; i < this.person.length; i++) {
			if (this.person[i] == null) {
				this.person[i] = person;
				break;
			}
		}
	}
	
}
