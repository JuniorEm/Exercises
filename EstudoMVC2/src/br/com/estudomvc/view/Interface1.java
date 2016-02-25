package br.com.estudomvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Interface1 implements Interface {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("-------------------- Sistema De Vôo -----------------------------");
		System.out.println("1 - Cadastrar Cliente -------------------------------------------");
		System.out.println("2 - Consultar Cliente -------------------------------------------");
		System.out.println("3 - Reservar Vôo ------------------------------------------------");
		System.out.println("4 - Sair --------------------------------------------------------");
		System.out.println("\nDigite uma opção: ---------------------------------------------");
		
		Map<Integer, Interface> view = new HashMap<>();
		view.put(1, new Interface2());
		String option = br.readLine();
		Interface2 inter = (Interface2) view.get(option);
		inter.main(args);
	}
}
