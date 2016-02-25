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
		this.nome = nome; /** Não há necessidade pois temos um "SET" dentro de um construtor
	}*/
	
	public String getNome(){
		return this.nome;
	}
	
	/*public void setCnpj(String cnpj){
		this.cnpj = cnpj; /** Não há necessidade pois temos um "SET" dentro de um construtor
	}*/
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	//Methods
	public void adiciona(Funcionario f){
		for (int i=0; i<11; i++){ //Para i de 0 até i menor que 11, conte mais um
			if (this.funcionario[i]==null){ //Se a posição de funcionário for nula
				this.funcionario[i] = f; //Adicione um funcionário a posição
				break; //O break está sendo utilizado porque senão ele ficará adicionando o mesmo funcionário várias vezes até satisfazer a condição
			}
		}
	}
	
	public void print(){
		for (Funcionario i: funcionario){//int i=0; i<this.funcionario.length; i++){
			if (i!=null){
				System.out.println("\nFuncionário: "+i.print());
			}
			}
		}
	}
