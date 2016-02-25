package br.com.unicamp.modelo;

public class ImplementaRepositorioA implements Repositorio {
	Pessoa[] vetorDePessoa = new Pessoa[10];

	
	//Constructor
	public ImplementaRepositorioA() {}
	
	public ImplementaRepositorioA(int size) {
		this.vetorDePessoa = new Pessoa[size];
	}
	
	//Methods
	public void guarda(Pessoa pessoa) {
		for (int i = 0; i < vetorDePessoa.length; i++) {
			if (vetorDePessoa[i] == null) {
				vetorDePessoa[i] = pessoa;
				break;
			}
		}
	}

	public Pessoa recupera(String cpf) {
		for (int i = 0; i < vetorDePessoa.length; i++) {
			if (vetorDePessoa[i] != null && vetorDePessoa[i].getCpf() == cpf) {
				return vetorDePessoa[i];
			}
		}
		return null;
	}


	public Pessoa primeiro() {
		if (vetorDePessoa[0] != null) {
			return vetorDePessoa[0];
		}
		return null;
	}

	public Pessoa proximo() {
		for (int i = 0; i < vetorDePessoa.length; i++) {
			if (vetorDePessoa[i + 1] != null) {
				return vetorDePessoa[i + 1];
			}
		}
		return null;
	}
	
	public Pessoa[] getVetor() {
		return vetorDePessoa;
	}
	
	public void remove(Pessoa pessoa) {
		for (int i = 0; i < vetorDePessoa.length; i++) {
			if (vetorDePessoa[i].equals(pessoa)) {
				vetorDePessoa[i] = null;
				break;
			}
		}
	}

}
