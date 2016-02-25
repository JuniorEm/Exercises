
public class TestaCasa {
	public static void main(String[] args){
		Casa casa = new Casa();
		Porta porta = new Porta();
		casa.porta1 = porta;
		casa.porta1.fecha();
		casa.porta2 = porta;
		casa.porta2.fecha();
		casa.porta3 = porta;
		casa.porta3.fecha();
		casa.pinta("Azul");
		System.out.println(casa.mostra());
		
	}

}