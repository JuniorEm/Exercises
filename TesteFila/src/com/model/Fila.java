package com.model;

import java.util.LinkedList;

public class Fila {
	private LinkedList<Paciente> pacientes = new LinkedList<>();
	
	public Fila() {}
	
	public void adiciona(Paciente paciente) {
		pacientes.add(paciente);
	}
	
	public void remove() {
		pacientes.remove();
	}
	
	public LinkedList<Paciente> getFila() {
		return pacientes;
	}
}
