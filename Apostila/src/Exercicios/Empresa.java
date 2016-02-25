package Exercicios;

public class Empresa {
	private String nome;
	private String cnpj;
	Funcionario[] funcionario;
	
	//Constructors
	public Empresa (String nome, String cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	//Get & Set
	/*public void setNome(String nome){
		this.nome = nome; /** N�o h� necessidade pois temos um "SET" dentro de um construtor
	}*/
	
	public String getNome(){
		return this.nome;
	}
	
	/*public void setCnpj(String cnpj){
		this.cnpj = cnpj; /** N�o h� necessidade pois temos um "SET" dentro de um construtor
	}*/
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	//Methods
	public void adiciona(Funcionario f){
		for (int i=0; i<11; i++){ //Para i de 0 at� i menor que 11, conte mais um
			if (this.funcionario[i]==null){ //Se a posi��o de funcion�rio for nula
				this.funcionario[i] = f; //Adicione um funcion�rio a posi��o
				break; //O break est� sendo utilizado porque sen�o ele ficar� adicionando o mesmo funcion�rio v�rias vezes at� satisfazer a condi��o
			}
		}
	}
	
	public void print(){
		for (Funcionario i: funcionario){//int i=0; i<this.funcionario.length; i++){
			if (i!=null){
				System.out.println("\nFuncion�rio: "+i.print());
			}
			}
		}
	}
