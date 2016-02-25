
public class ArrayFuncionario {
	Funcionario[] funcionario;
	
	//Constructors
	public ArrayFuncionario(int size) {
		this.funcionario = new Funcionario[size];
	}
	
	//No Get & Set
	
	
	//Methods
	public void cadastra(Funcionario i) {
		for (int y=0; y<this.funcionario.length; y++) {
			if (funcionario[y]==null){
				funcionario[y] = i;
				break; //Break utilizado porque se não ele repete a mesma inserção até satisfazer a condição do FOR
			}
		}
	}
	
	public void mostra(){
		for (Funcionario f: funcionario){
			if (f!=null) {
				System.out.println(f);
			}
		}
	}
	

		
}
