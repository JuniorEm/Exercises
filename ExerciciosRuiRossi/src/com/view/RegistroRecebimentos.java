package com.view;

import javax.swing.JOptionPane;

import com.model.EDadoInvalido;
import com.model.ItemVenda;
import com.model.Recebivel;
import com.model.Servico;
import com.model.Validacao;

public class RegistroRecebimentos {
	
	public static Recebivel[] registros = new Recebivel[100];
	
	public static void registraRecebimento(Recebivel recebivel) {
		for (int i = 0; i < registros.length; i++) {
			if (registros[i] == null) {
				registros[i] = recebivel;
				break;
			}
		}
	}
	
	public static Recebivel[] getListaRecebimento() {
		return registros;
	}
	
	public static void main(String[] args) {
		String[] array;
		int confirmOption = JOptionPane.YES_OPTION;
		String produto = "";
		String quantidade = "";
		String precoUnitario = "";
		String descricao = "";
		String hora = "";
		String precoHora = "";
		int option;
		

			while (confirmOption == JOptionPane.YES_OPTION) {
				
				option = JOptionPane.showOptionDialog(null, "Venda ou Servi�o?", "Escolha uma op��o: ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
						null, array = new String[] {"Venda", "Servi�o"}, "array[0]");
								
				if (option == 0) {
					produto = EDadoInvalido.validaCampoVazio(produto, "Digite o nome do Produto: ", "O produto precisa ser informado!");
					Validacao.verificaSeCancelFoiClicado(produto);
					

					quantidade = EDadoInvalido.validaCampoVazio(quantidade, "Digite a quantidade do Produto: ", 
							"� necess�rio o preenchimento do campo quantidade!");
					Validacao.verificaSeCancelFoiClicado(quantidade);
					

					precoUnitario = EDadoInvalido.validaCampoVazio(precoUnitario, "Digite o pre�o unit�rio: ", 
							"O pre�o unit�rio precisa ser informado!");
					Validacao.verificaSeCancelFoiClicado(precoUnitario);
					
					registraRecebimento(new ItemVenda(produto, Integer.parseInt(quantidade), Double.parseDouble(precoUnitario)));
				
			} else {
				if (option == 1) {
					descricao = EDadoInvalido.validaCampoVazio(descricao, "Digite a descri��o do servi�o: ", "Descri��o precisa ser informada!");
					Validacao.verificaSeCancelFoiClicado(descricao);

					hora = EDadoInvalido.validaCampoVazio(hora, "Digite as horas: ", "Horas precisam ser informadas");
					Validacao.verificaSeCancelFoiClicado(hora);
					
					precoHora = EDadoInvalido.validaCampoVazio(precoHora, "Digite o pre�o unit�rio: ", "Pre�o unit�rio precisa ser informado!");
					Validacao.verificaSeCancelFoiClicado(precoHora);
					
					registraRecebimento(new Servico(descricao, Integer.parseInt(hora), Double.parseDouble(precoHora)));
				} 
			}

				confirmOption = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais?");
				
				if (confirmOption == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, getListaRecebimento());
				}
		}
			
		
		
		
		
	}
	
}
