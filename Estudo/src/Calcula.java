import javax.swing.JOptionPane;

public class Calcula {
	public static void main(String[] args) {
		int x = 0;
                int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Opera��o (1-Adi��o) (2-Subtra��o) (3-Multiplica��o) (4-Divis�o): "));
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "N�mero: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Outro n�mero: "));

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
                            JOptionPane.showMessageDialog(null, "Op��o inv�lida");
                        }
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: "+x);
		
	}
}
	

