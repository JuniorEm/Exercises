package Examples;

public class Cliente {
	public String nome;
	public String dataDeCriacao;
	
	
	public Cliente(String nome, String dataDeCriacao){
		this.nome = nome;
		this.dataDeCriacao = dataDeCriacao;
	}
	
	public String retornaDados(){
		String dados = "Nome: "+nome+
				"\nData de Criação da Conta: "+dataDeCriacao;
		return dados;
	}
	

}
