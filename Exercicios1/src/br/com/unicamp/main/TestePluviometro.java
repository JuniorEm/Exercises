package br.com.unicamp.main;

import br.com.unicamp.modelo.CaminhaoAlfa;
import br.com.unicamp.modelo.CaminhaoBeta;
import br.com.unicamp.modelo.Pluviometro;

public class TestePluviometro {
	public static void main(String[] args) {
		Pluviometro pluviometro = new Pluviometro("Bucket Pluvi�metro");
		Pluviometro pluviometro1 = new Pluviometro("Padr�o");
		Pluviometro pluviometro2 = new Pluviometro("Bucket Pluvi�metro");
		Pluviometro pluviometro3 = new Pluviometro("Pluvi�metro �ptico");
		Pluviometro pluviometro4 = new Pluviometro("Pluvi�metro �ptico");
		
		CaminhaoAlfa caminhao = new CaminhaoAlfa("Alfa");
		caminhao.inserePluviometro(pluviometro);
		caminhao.inserePluviometro(pluviometro1);
		caminhao.inserePluviometro(pluviometro2);
		caminhao.inserePluviometro(pluviometro3);
		
		CaminhaoBeta caminhao2 = new CaminhaoBeta("Beta");
		caminhao2.inserePluviometro(pluviometro);
		caminhao2.inserePluviometro(pluviometro1);
		caminhao2.inserePluviometro(pluviometro2);
		caminhao2.inserePluviometro(pluviometro3);
		caminhao2.inserePluviometro(pluviometro4);
		
		Pluviometro[] carga = caminhao.getCarregamento();
		Pluviometro[] carga2 = caminhao2.getCarregamento();
		
		
		//Enhanced for
		for (Pluviometro teCopiei : carga2) {
			if (teCopiei != null) {
				System.out.println(teCopiei.getTipo());
			}
		}
	}
}
