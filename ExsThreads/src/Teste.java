 
public class Teste {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("Programa 1 valor: " + i);
				}
			}
			};
		
		Thread t1 = new Thread(r);
		t1.start();
		

		

	}
}
