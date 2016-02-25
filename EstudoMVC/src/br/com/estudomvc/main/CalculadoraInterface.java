package br.com.estudomvc.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.estudomvc.controle.CalculadoraController;
import br.com.estudomvc.factory.IOFactory;
import br.com.estudomvc.modelo.Calculo;
import br.com.estudomvc.modelo.Divisao;
import br.com.estudomvc.modelo.Multiplicacao;
import br.com.estudomvc.modelo.Soma;
import br.com.estudomvc.modelo.Subtracao;

public class CalculadoraInterface {
	public static void main(String[] args) {
		
		IOFactory io = new IOFactory();
		
		
		System.out.println("--------------------------------------");
		System.out.println("--------------Calculadora-------------");
		System.out.println("--------Escolha a sua Opção: ---------");
		System.out.println("1 ----------------Soma----------------");
		System.out.println("2 -------------Subtração--------------");
		System.out.println("3 --------------Divisão---------------");
		System.out.println("4 ------------Multiplicação-----------");
		
		try {
			System.out.println("\n");
			try {
				String option = io.leString();
				
				System.out.println("Digite um valor: ");
				int x = io.leInt();
				Integer xv = new Integer(x);
				double i = xv.doubleValue();
				
				System.out.println("Digite um outro valor: ");
				int y = io.leInt();
				Integer yv = new Integer(y); //Autoboxing
				double j = yv.doubleValue();
				
				System.out.println("Resultado: " + new CalculadoraController(option, i, j).getResultado());
				
			} catch (RuntimeException e){
				throw new RuntimeException("Valor passado inválido! " + e);
			}
			
		} catch (IOException e) {
			throw new RuntimeException("Erro na entrada e na saída" + e);
		}
	}
}
