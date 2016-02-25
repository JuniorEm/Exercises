
public class TestaPorta {
	public static void main(String[] args){
		Porta porta = new Porta();
		porta.dimensaoX = 50.0;
		porta.dimensaoY = 60.0;
		porta.dimensaoZ = 70.0;
		porta.cor = "Bege";
		porta.pinta("Marfim");
		porta.fecha();
		System.out.println(porta.mostra());
		porta.estaAberta();
	}

}
