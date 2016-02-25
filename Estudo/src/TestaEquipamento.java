
public class TestaEquipamento {
	public static void main(String[] args) {
		EquipamentoSonoro es = new EquipamentoSonoro();
		System.out.println(es);
		es.liga();
		es.setVolume((short) 10);
		//System.out.println("Volume: " +es.getVolume());
		System.out.println(es);
	}

}
