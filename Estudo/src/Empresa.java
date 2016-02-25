
public class Empresa {
	String nome;
	Data dataDeCriacao;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];

	// Constructors

	// Get & Set

	// Methods
	public void adiciona(Funcionario f) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] == null) {
				this.funcionarios[i] = f;
				break;
			}
		}
	}

	public void mostra() {
		for (Funcionario i : funcionarios) {
			if (i != null) {
				System.out.println(i.mostra());
			}
		}
	}

	public boolean contem(Funcionario f) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (this.funcionarios[i] == f) {
				System.out.println("\nO funcionário "+f.nome+" se encontra na empresa "+this.nome);
				return true;
			}
		}
		System.out.println("\nO funcionário "+f.nome+" não se encontra na empresa "+this.nome);
		return false;
	}

}
