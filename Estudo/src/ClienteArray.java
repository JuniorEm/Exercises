
public class ClienteArray {
	Cliente[] cliente;

	
	
	//Constructors
	public ClienteArray(){
		this.cliente = new Cliente[100];
	}
	
	public ClienteArray(int arrayHeight){
		this.cliente = new Cliente[arrayHeight];
	}
	
	
	//Get & Set
	
	
	
	//Methods
	public void adiciona(Cliente c){
		for (int i = 0; i<cliente.length; i++){
			if (this.cliente[i]==null){
				this.cliente[i] = c;
				break;
			}
		}
	}
	
	public void mostraCliente(){
		for (Cliente i: cliente){
			if (i!=null){
				System.out.println(i.toString());
			}
		}
	}

}
