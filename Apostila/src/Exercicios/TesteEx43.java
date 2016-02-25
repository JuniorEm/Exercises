package Exercicios;

public class TesteEx43 {
	public static void main(String[] args) {
		/*Casa casa = new Casa("verde");
		Porta porta = new Porta("azul", 20.0, 30.0, 40.0);
		casa.porta1 = porta;
		casa.porta1.fecha();
		
		Porta p2 = new Porta("vermelho", 30.0, 40.0, 50.0);
		casa.porta2 = p2;
		casa.porta2.fecha();
		
		Porta p3 = new Porta("Roxo", 40.0, 50.0, 60.0);
		casa.porta3 = p3;
		casa.porta3.fecha();
		
		System.out.println(casa.quantasPortasEstaoAbertas());
	*/
		
		Casa casa = new Casa("Verde");
		casa.porta = new Porta[11];
		/*Porta p1 = new Porta("Azul", 20.0, 30.0, 40.0);
		p1.fecha();
		p1.estaAberta();
		Porta p2 = new Porta("Vermelho", 30.0, 40.0, 50.0);
		p2.fecha();
		Porta p3 = new Porta("Roxo", 40.0, 50.0, 60.0);
		p3.abre();
		Porta p4 = new Porta("Amarela", 50.0, 60.0, 70.0);
		p4.abre();
		Porta p5 = new Porta("Rosa", 50.0, 60.0, 70.0);*/
		
		for (int i = 0; i<10; i++){
			Porta p = new Porta();
			casa.adicionaPorta(p);
		}
		
		Porta p5 = new Porta("Rosa", 50.0, 60.0, 70.0);
		
		/*casa.adicionaPorta(p1);
		casa.adicionaPorta(p2);
		casa.adicionaPorta(p3);
		casa.adicionaPorta(p4);
		*/
		casa.adicionaPorta(p5);
		casa.mostraPorta();
		System.out.println("\nTotal de Portas: "+casa.totalDePortas());
		System.out.println("\nTotal de Portas Abertas: "+casa.quantasPortasEstaoAbertas());
		
	}
		

}
