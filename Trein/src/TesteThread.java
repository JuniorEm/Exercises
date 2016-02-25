
public class TesteThread {
	

	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);
		Thread th = new Thread(p1);
		th.start();
		System.out.println(th.getName());
		
		Programa p2 = new Programa();
		p2.setId(2);
		Thread th2 = new Thread(p2);
		th2.start();
		System.out.println(th2.getName());
		
		Programa p3 = new Programa();
		p3.setId(3);
		Thread th3 = new Thread(p3);
		th3.start();
		System.out.println(th3.getName());
		
		
		
		
	}

}
