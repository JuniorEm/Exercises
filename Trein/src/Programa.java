
public class Programa implements Runnable {
	
	public int aux;
	private int id;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			aux = aux + i;
			System.out.println("Programa: " + this.getId() + " — Valor: " + this.aux);
		}
	}
		
	public synchronized int mult(int x) {
		return this.aux * x;
	}

		

}
