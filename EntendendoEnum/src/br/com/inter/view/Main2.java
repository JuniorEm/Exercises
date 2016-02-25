package br.com.inter.view;

import br.com.inter.model.PessoaEnum;

public class Main2 {
	public static String escolhePessoa(PessoaEnum pessoa) throws Exception {
		if (pessoa == PessoaEnum.PESSOAFISICA) {
			return PessoaEnum.PESSOAFISICA.pessoaTipo;
		} else {
			if (pessoa == PessoaEnum.PESSOAJURIDICA) {
				return PessoaEnum.PESSOAJURIDICA.pessoaTipo;
			} else {
				throw new Exception("O valor não foi reconhecido!");
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(Main2.escolhePessoa(PessoaEnum.PESSOAFISICA));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
