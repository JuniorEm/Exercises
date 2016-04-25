package com.view;

import javax.swing.JOptionPane;

import com.model.Imposto;

public class Main {
	public static void main(String[] args) {
		double value = Double.parseDouble(JOptionPane.showInputDialog("Faturamento mensal"));
		Imposto imposto = new Imposto(value);
		
			JOptionPane.showMessageDialog(null, imposto.info());
	}
}
