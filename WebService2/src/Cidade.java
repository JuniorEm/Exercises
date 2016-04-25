
public class Cidade {
	private final String nome;
	private final String uf;
	private final String id;
	
	public Cidade(String nome, String uf, String id) {
		this.nome = nome;
		this.uf = uf;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getUf() {
		return uf;
	}
	
	public String getId() {
		return id;
	}
}
