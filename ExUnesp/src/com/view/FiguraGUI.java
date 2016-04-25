package com.view;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import com.model.CirculoGUI;
import com.model.FormaGeometrica;
import com.model.FormaGeometricaGUI;
import com.model.QuadradoGUI;
import com.model.RetanguloGUI;

public class FiguraGUI {
	FormaGeometrica[] formas;
	private int size;
	private int cont;
	private int option;
	/*private String ladoQuadrado = "";
	private String baseRetangulo;
	private String alturaRetangulo;
	private String raioCirculo;*/

	public FiguraGUI() {
		initialize();
	}

	public void addInArray(FormaGeometrica forma) {
		for (int i = 0; i < formas.length; i++) {
			if (formas[i] == null) {
				formas[i] = forma;
				break;
			}
		}
	}

	public FormaGeometrica[] getFormas() {
		return formas;
	}

	public void initialize() {
		size = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas figuras você pretende criar: "));
		formas = new FormaGeometrica[size];
		getOption();
	}

	public void getOption() {
		String[] array;
		option = JOptionPane.showOptionDialog(null, "Quadrado, Retângulo, ou Círculo?", "Escolha sua opção: ",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
				array = new String[] { "Quadrado", "Retângulo", "Círculo" }, "Quadrado");
		/*
		if (option == 0) {
			ladoQuadrado = JOptionPane.showInputDialog("Digite lado para seu quadrado: ");
			addInArray(new Quadrado(Double.parseDouble(ladoQuadrado)));
		} else if (option == 1) {
			baseRetangulo = JOptionPane.showInputDialog("Digite base para retângulo: ");
			alturaRetangulo = JOptionPane.showInputDialog("Digite a altura para o retângulo: ");
			addInArray(new Retangulo(Double.parseDouble(baseRetangulo), Double.parseDouble(alturaRetangulo)));
		} else {
			raioCirculo = JOptionPane.showInputDialog("Digite o raio para o círculo: ");
			addInArray(new Circulo(Double.parseDouble(raioCirculo)));
		} */
		
		Map<Integer, FormaGeometricaGUI> mapa = new HashMap<>();
		mapa.put(0, new QuadradoGUI());
		mapa.put(1, new RetanguloGUI());
		mapa.put(2, new CirculoGUI());
		
		FormaGeometrica formaGeometrica = mapa.get(option).exibeMensagem();
		addInArray(formaGeometrica);
	
		cont++;
		verifyCondition();
	}

	public void verifyCondition() {
		if (cont < formas.length)
			getOption();
		 else JOptionPane.showMessageDialog(null, getFormas());
		
	}

}
