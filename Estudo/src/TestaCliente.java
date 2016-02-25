
public class TestaCliente {
	public static void main(String[] args){
		ClienteArray ca1 = new ClienteArray();
		Cliente cliente = new Cliente(1, "Romeu", "1234-5678", 15000.0);
		ca1.adiciona(cliente);
		Cliente cliente2 = new Cliente(2, "Alface", "3214-5443", 15400.0);
		ca1.adiciona(cliente2);
		
		for (int i=0; i<150; i++){
			Cliente c = new Cliente(i, "Bolinha", "1111-1111", 1000*i);
			ca1.adiciona(c);
		}
		
		ca1.mostraCliente();
		
	}

}
