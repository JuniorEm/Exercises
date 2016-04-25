package com.model;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente(1, "Monique", Gravidade.MINIMA);
		Paciente paciente2 = new Paciente(2, "Junior", Gravidade.ALTA);
		Paciente paciente3 = new Paciente(3, "Selma", Gravidade.MEDIA);
		Paciente paciente4 = new Paciente(4, "Reginaldo", Gravidade.ALTA);
		
		Fila fila = new Fila();
		fila.adiciona(paciente1);
		fila.adiciona(paciente2);
		fila.adiciona(paciente3);
		fila.adiciona(paciente4);
		
		LinkedList<Paciente> pacientes = fila.getFila();
		Collections.sort(pacientes);
		
		for (Paciente paciente : pacientes)
			System.out.println(paciente);
	}
}
