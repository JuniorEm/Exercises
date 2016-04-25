import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Teste {
	public static void main(String[] args) {
		XStream xstream = new XStream(new DomDriver());
		Person person = new Person("bonitinho", "11111111");
		Person person2 = new Person("feinho", "2222222");
		TagFora tagFora = new TagFora();
		tagFora.adiciona(person);
		tagFora.adiciona(person2);
		
		System.out.println(xstream.toXML(tagFora));
	}
}
