
public class TestaLampada {
	public static void main(String[] args){
		Lampada lamp1 = new Lampada();
		lamp1.liga();
		Lampada lamp2 = new Lampada();
		lamp2.desliga();
		lamp2.liga();
		
		System.out.println(lamp2.observa());
	}

}
