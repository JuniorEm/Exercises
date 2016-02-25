
public class TestaSujeito {
	public static void main(String[] args){
		Sujeito sujeito1 = new Sujeito("Ayrton", "Senna");
		Empregado empregado1 = new Empregado("Michael", "Schumacher", 1600000);
		Professor professor1 = new Professor("Alain", "Proust", 500000);
		Professor professor2 = new Professor("Nigell", "Mansell", 1500000);
		Empregado empregado2 = professor2;
		
		System.out.println(sujeito1.getNomeCompleto());
		
		System.out.println("\n"+empregado1.getNomeCompleto());
		System.out.println("Salário Primeira Parcela: "+empregado1.getSalarioPrimeiraParcela());
		System.out.println("Salário Segunda Parcela: "+empregado1.getSalarioSegundaParcela());
		
		System.out.println("\n"+professor1.getNomeCompleto());
		System.out.println("Salário Primeira Parcela: "+professor1.getSalarioPrimeiraParcela());
		System.out.println("Salário Segunda Parcela: "+professor1.getSalarioSegundaParcela());
		professor1.setSalario(500);
		System.out.println(professor1.getSalarioPrimeiraParcela());
		
		System.out.println("\n"+empregado2.getNomeCompleto()); //Nigell Mansell  é um professor, observe Empregado empregado2 atribuindo a professor2
		System.out.println("Salário Primeira Parcela: "+empregado2.getSalarioPrimeiraParcela());
		System.out.println("Salário Segunda Parcela: "+empregado2.getSalarioSegundaParcela());
				
	}

}
