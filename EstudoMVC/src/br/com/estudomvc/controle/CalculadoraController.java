package br.com.estudomvc.controle;

import java.util.HashMap;
import java.util.Map;

import br.com.estudomvc.modelo.Calculo;
import br.com.estudomvc.modelo.Divisao;
import br.com.estudomvc.modelo.Multiplicacao;
import br.com.estudomvc.modelo.Soma;
import br.com.estudomvc.modelo.Subtracao;

public class CalculadoraController {
	String option = null;
	double valor1 = 0;
	double valor2 = 0;
	
	public CalculadoraController(String option, double valor1, double valor2) {
		this.option = option;
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public double getResultado() {
		Map mapaDeCalculo = new HashMap();
		mapaDeCalculo.put("1", new Soma());
		mapaDeCalculo.put("2", new Subtracao());
		mapaDeCalculo.put("3", new Divisao());
		mapaDeCalculo.put("4", new Multiplicacao());
		
		
		Calculo calculo = (Calculo) mapaDeCalculo.get(option);
		return calculo.getCalculo(valor1, valor2);
	}
	
	
	
	
}
