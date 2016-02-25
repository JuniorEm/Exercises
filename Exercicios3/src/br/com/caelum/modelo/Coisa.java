package br.com.caelum.modelo;

public class Coisa {
	
	//Methods
	public void confronto(Coisa coisa, Coisa outraCoisa) {
		if ((coisa instanceof Pedra) && outraCoisa instanceof Papel) {
				System.out.println("Papel ganha de Pedra!");
		} else if ((coisa instanceof Pedra) && outraCoisa instanceof Tesoura) {
				System.out.println("Pedra ganha de Tesoura!");
		} else if ((coisa instanceof Pedra) && outraCoisa instanceof Pedra) {
				System.out.println("Deu empate!");
		} else if ((coisa instanceof Tesoura) && outraCoisa instanceof Papel) {
				System.out.println("Tesoura ganha de papel");
		} else if ((coisa instanceof Tesoura) && outraCoisa instanceof Pedra) {
				System.out.println("Pedra ganha de Tesoura!");
		} else if ((coisa instanceof Tesoura) && outraCoisa instanceof Tesoura) {
				System.out.println("Deu empate!");
		} else if ((coisa instanceof Papel) && outraCoisa instanceof Pedra) {
				System.out.println("Papel ganha de Pedra!");
		} else if ((coisa instanceof Papel) && outraCoisa instanceof Tesoura) {
				System.out.println("Tesoura ganha de papel!");
		} else if ((coisa instanceof Papel) && outraCoisa instanceof Papel) {
				System.out.println("Deu empate!");
		}
	}
}
