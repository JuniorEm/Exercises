package com.view;

import javax.swing.JOptionPane;

import com.model.EDadoInvalido;
import com.model.ItemVenda;
import com.model.Recebivel;
import com.model.Servico;

public class RegistraRecebimentos3 {
	public static Recebivel[] registros = new Recebivel[100];
	String jOptionMsg = "";
	String jOptionQuantidade = "";
	String jOptionPreco = "";
	int option;
	int confirmOption;
	
	public RegistraRecebimentos3() {
		telaDeInicio();
	}
	
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
	
	public void telaDeInicio() {
		String[] array;
		
		option = JOptionPane.showOptionDialog(null, "Venda ou Serviço?", "Escolha uma opção: ",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
				array = new String[] { "Venda", "Serviço" }, "array[0]");
		
		telaDesc();
	}
	
	public void telaDesc() {
		jOptionMsg = "";
		jOptionMsg = ((option == 0
				? EDadoInvalido.validaCampoVazio(jOptionMsg, "Digite o nome do produto: ",
						"O produto precisa ser informado!")
				: EDadoInvalido.validaCampoVazio(jOptionMsg, "Digite o nome do serviço: ",
						"O serviço " + "precisa ser informado")));
		telaQuant();
	}
	
	public void telaQuant() {
		jOptionQuantidade = "";
		jOptionQuantidade = ((option == 0
				? EDadoInvalido.validaCampoVazio(jOptionQuantidade, "Digite a quantidade do produto: ",
						"A quantidade precisa ser informada!")
				: EDadoInvalido.validaCampoVazio(jOptionQuantidade, "Digite a quantidade de horas: ",
						"Horas precisam ser informadas!")));
		telaPreco();
	}
	
	public void telaPreco() {
		jOptionPreco = "";
		jOptionPreco = ((option == 0
				? EDadoInvalido.validaCampoVazio(jOptionPreco, "Digite o preço unitário: ",
						"O preço unitário precisa ser informado!")
				: EDadoInvalido.validaCampoVazio(jOptionPreco, "Digite o preço hora: ",
						"Preço hora precisa ser informado!")));
		adicionaArray();
	}
	
	public void adicionaArray() {
		if (option == 0)
			registraRecebimento(new ItemVenda(jOptionMsg, Integer.parseInt(jOptionQuantidade), Double.parseDouble(jOptionPreco)));
			else
				registraRecebimento(new Servico(jOptionMsg, Integer.parseInt(jOptionQuantidade), Double.parseDouble(jOptionPreco)));
		telaEscolha();
	}
	
	public void telaEscolha() {
		confirmOption = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

		if (confirmOption == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(null, getListaRecebimento());
		else
			 telaDeInicio();			
	}
	
	
	public static void main(String[] args) {
		new RegistraRecebimentos3();
	}
}
