import javax.swing.JOptionPane;

public class Calcula {
	public static void main(String[] args) {
		int x = 0;
                int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Operação (1-Adição) (2-Subtração) (3-Multiplicação) (4-Divisão): "));
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Número: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Outro número: "));

		if (a ==1) {
			x = n + d;
		} else {
			if (a == 2) {
				x = n - d;
			} else if (a == 3) {
				x = n * d;
			} else if (a == 4){
				x = n / d;
                        } else{
                            JOptionPane.showMessageDialog(null, "Opção inválida");
                        }
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: "+x);
		
	}
}
	

