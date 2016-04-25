package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main32 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String entrada = br.readLine();

		String[] vetor = entrada.split(" ");
		int horaInicial = Integer.parseInt(vetor[0]);
		int minutoInicial = Integer.parseInt(vetor[1]);
		int horaFinal = Integer.parseInt(vetor[2]);
		int minutoFinal = Integer.parseInt(vetor[3]);
		
		int horas = 0;
		int minutos = 0;
						
		if (horaInicial > horaFinal) {
			horas = 24 - horaInicial;
			horas = horas + horaFinal;
		} else if (horaInicial < horaFinal && minutos < 60) {
			horas = Math.abs(horaFinal - horaInicial);
		}
		
		if (horaInicial == horaFinal)
			horas = 24;
		
		if (minutoFinal == minutoInicial)
			minutos = 0;
		
		if (minutoInicial > minutoFinal) {
			minutos = 60 - minutoInicial;
			minutos = minutos + minutoFinal;
			horas = horas - 1;
		} else {
			minutos = Math.abs(minutoFinal - minutoInicial);
		}
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S)" + " E " + minutos + " MINUTO(S)");
	}
}
