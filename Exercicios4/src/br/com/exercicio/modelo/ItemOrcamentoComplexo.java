package br.com.exercicio.modelo;

public class ItemOrcamentoComplexo extends ItemOrcamento {
	ItemOrcamento[] subItem = new ItemOrcamento[100];
	float soma = 0;
	
	//Constructor
	public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subItem) {
		super(historico, valor);
		this.subItem = subItem;
		// TODO Auto-generated constructor stub
	}
	
	//Getters and Setters
	public ItemOrcamento getItem(String historico) {
		try { //UNCHECKED
			for (int i = 0; i < subItem.length; i++) {
				if (subItem[i].getHistorico().equalsIgnoreCase(historico)) {
					return subItem[i];
				}
			} 
			
		} catch (NullPointerException e) {
			throw new RuntimeException("Elemento não encontrado!");
		}
			return null;
	}
	
	public Float getValor() {
		for (int i = 0; i < subItem.length; i++) {
			if (subItem[i] != null) {
				soma = soma + subItem[i].valor;
			}
		}
		
			return soma;
	}
	//Methods
	
	
	
	
}
