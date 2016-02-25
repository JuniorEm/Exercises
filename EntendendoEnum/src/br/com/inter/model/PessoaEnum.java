package br.com.inter.model;

public enum PessoaEnum {
	PESSOAFISICA("fisica"), PESSOAJURIDICA("juridica");
	
	public String pessoaTipo;
	
	PessoaEnum(String pessoaTipo) {
		this.pessoaTipo = pessoaTipo;
	}
}
