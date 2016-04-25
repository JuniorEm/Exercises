package com.view;

import javax.swing.JOptionPane;

import com.model.EDadoInvalido;
import com.model.ItemVenda;
import com.model.Recebivel;
import com.model.Servico;

public class RegistroRecebimentos2 {
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
		String[] array = null;
		int confirmOption = JOptionPane.YES_OPTION;
		int step = 1;
		int option = 0;
		String jOptionMsg = "";
		String jOptionQuantidade = "";
		String jOptionPreco = "";
		int quantidade = 0;
		double preco = 0.0;

		while (confirmOption == JOptionPane.YES_OPTION) {

			switch (step) {
			case 1:
				option = JOptionPane.showOptionDialog(null, "Venda ou Serviço?", "Escolha uma opção: ",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
						array = new String[] { "Venda", "Serviço" }, "array[0]");
				step++;
				break;

			case 2:
				jOptionMsg = "";
				jOptionMsg = ((option == 0
						? EDadoInvalido.validaCampoVazio(jOptionMsg, "Digite o nome do produto: ",
								"O produto precisa ser informado!")
						: EDadoInvalido.validaCampoVazio(jOptionMsg, "Digite o nome do serviço: ",
								"O serviço " + "precisa ser informado")));
				step++;
				break;
	

			case 3:
				jOptionQuantidade = "";
				jOptionQuantidade = ((option == 0
						? EDadoInvalido.validaCampoVazio(jOptionQuantidade, "Digite a quantidade do produto: ",
								"A quantidade precisa ser informada!")
						: EDadoInvalido.validaCampoVazio(jOptionQuantidade, "Digite a quantidade de horas: ",
								"Horas precisam ser informadas!")));
				step++;
				break;

			case 4:
				jOptionPreco = "";
				jOptionPreco = ((option == 0
						? EDadoInvalido.validaCampoVazio(jOptionPreco, "Digite o preço unitário: ",
								"O preço unitário precisa ser informado!")
						: EDadoInvalido.validaCampoVazio(jOptionPreco, "Digite o preço hora: ",
								"Preço hora precisa ser informado!")));
				step++;
				break;

			case 5:
				quantidade = Integer.parseInt(jOptionQuantidade);
				preco = Double.parseDouble(jOptionPreco);

				if (option == 0)
					RegistroRecebimentos2.registraRecebimento(new ItemVenda(jOptionMsg, quantidade, preco));
				else
					RegistroRecebimentos2.registraRecebimento(new Servico(jOptionMsg, quantidade, preco));
				step++;
				break;

			case 6:
				confirmOption = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

				if (confirmOption == JOptionPane.NO_OPTION)
					JOptionPane.showMessageDialog(null, RegistroRecebimentos2.getListaRecebimento());
				else
					step = 1;
				break;
			}
		}

	}
}
