package br.com.exercicio.modelo;

public class ItemOrcamento {
	private String historico;
	protected float valor;
	ItemOrcamento[] item = new ItemOrcamento[100];
	
	//Constructors
	public ItemOrcamento(String historico, float valor) {
		this.historico = historico;
		this.valor = valor;
	}
	
	//Getters and Setters
	public String getHistorico() {
		return historico;
	}
	
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
	public Float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void adiciona(ItemOrcamento item) {

		for (int i = 0; i < this.item.length; i++) {
			if (this.item[i] == null) {
				this.item[i] = item;
				break;
			}
		}
	}
	
	public ItemOrcamento[] getItem() {
		return item;
	}
	
	public String toString() {
		return "\nHistórico: " + this.getHistorico();
	}
}
