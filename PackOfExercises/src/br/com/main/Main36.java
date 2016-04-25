package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main36 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		int contador = 0;

		int contadorInter = 0;
		int contadorGremio = 0;
		int contadorEmpate = 0;

		int decisao = 1;

		while (decisao == 1) {
			contador++;

			String[] array = br.readLine().split(" ");
			int valorInter = Integer.parseInt(array[0]);
			int valorGremio = Integer.parseInt(array[1]);

			if (valorInter > valorGremio)
				contadorInter++;
			else if (valorGremio > valorInter)
				contadorGremio++;
			else
				contadorEmpate++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			decisao = Integer.parseInt(br.readLine());
		}
		
		System.out.println(contador + " grenais");
		System.out.println("Inter:" + contadorInter);
		System.out.println("Gremio:" + contadorGremio);
		System.out.println("Empates:" + contadorEmpate);
		if (contadorInter > contadorGremio)
			System.out.println("Inter venceu mais");
		else if (contadorGremio > contadorInter)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Nao houve vencedor");
	}
}
