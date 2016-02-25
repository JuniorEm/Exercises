package br.ic.unicamp.modelo;

import java.math.BigDecimal;

public class ItemOrcamentoComplexo extends ItemOrcamento {
	ItemOrcamento[] listaSubItem = new ItemOrcamento[10];

	public ItemOrcamentoComplexo(String historico, BigDecimal valor, ItemOrcamento[] listaSubItem) {
		super(historico, valor);
		this.listaSubItem = listaSubItem;
		
		ItemOrcamento novoItem = this.geraItem(historico, valor);
		
		for (int i = 0; i < this.listaSubItem.length; i++) {
			if (this.listaSubItem[i] == null) {
				this.listaSubItem[i] = novoItem;
				break;
			}
		}
	}
	
	public BigDecimal getValor() {
		float aux = 0;
		Float auxiliar = new Float(aux); //Autoboxing
		BigDecimal realAuxiliar = new BigDecimal(auxiliar.toString());
		
		for (int i = 0; i < listaSubItem.length; i++) {
			if (listaSubItem[i] != null) {
				realAuxiliar = listaSubItem[i].getValor().add(new BigDecimal(realAuxiliar.toString()));
			}
		}
		
		return realAuxiliar;
	}
	
	public ItemOrcamento encontraItem(String historico) {
		for (int i = 0; i < listaSubItem.length; i++) {
			if (listaSubItem[i] != null && listaSubItem[i].getHistorico().equalsIgnoreCase(historico)) {
				return listaSubItem[i];

			}
		}
		return null;
	}
	
	public void adiciona(ItemOrcamento item) {
		for (int i = 0; i < listaSubItem.length; i++) {
			if (listaSubItem[i] == null) {
				listaSubItem[i] = item;
				break;
			}
		}
	}

	public ItemOrcamento[] getLista() {
		return listaSubItem;
	}
	
	private ItemOrcamento geraItem(String historico, BigDecimal valor) {
		return new ItemOrcamento(historico, valor);
	}
	
	

}
