
public class TestaTransporte {
	public static void main(String[] args){
		Carro c1 = new Carro();
		c1.desliga();
		c1.setVelocidade(50);
		c1.liga();
		c1.setVelocidade(100);
		System.out.println("Velocidade: "+c1.getVelocidade()+" km/h");
		c1.setQuilometragem(13000);
		System.out.println("Quilometragem Total: "+c1.getQuilometragem()+" km");
	}


}
