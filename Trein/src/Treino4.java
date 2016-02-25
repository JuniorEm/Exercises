import javax.swing.JOptionPane;

public class Treino4 {
	public static void main(String[] args) {
		int aux = 1;
		
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para executarmos a fatoração: "));
		
		
		for (int i = 1; i <= y; i++) {
			aux = aux * i;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: " + aux);
		

		
		
	}
}