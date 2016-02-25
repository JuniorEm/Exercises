package br.com.teste.main;

import java.math.BigDecimal;

import br.com.teste.modelo.ContaCorrente;
import br.com.teste.modelo.ContaCorrenteEspecial;

public class Main {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(new BigDecimal("2000.50"));
		ContaCorrente cc1 = new ContaCorrenteEspecial(new BigDecimal("2000.50"));
		
		cc.saca(new BigDecimal("200.50"));
		System.out.println(cc.getSaldo());
		//cc.sacaComDouble(200.50);
		
		cc1.saca(new BigDecimal("200.50"));
		System.out.println(cc1.getSaldo());
		
		cc.deposita(cc1, new BigDecimal("200.50"));
		System.out.println(cc.getSaldo());
		System.out.println(cc1.getSaldo());
	}
}
