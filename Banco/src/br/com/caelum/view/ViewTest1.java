package br.com.caelum.view;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.caelum.model.Cliente;
import br.com.caelum.model.Conta;

public class ViewTest1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //Instância manual, pois Calendar é abstrato
		c.set(1994, 06-1, 05);
		Conta conta = new Conta("1114", new BigDecimal("1500.05"));
		Cliente cliente = new Cliente("Java", c, "36.627.483-1", "401.241.518-25", conta);

		Calendar c2 = Calendar.getInstance();
		c2.set(1995, 07-1, 04);
		Conta conta2 = new Conta("1115", new BigDecimal("25000.85"));
		Cliente cliente2 = new Cliente("Swift", c2, "87.897.480-x", "203.434.328-21", conta2);
		
		conta.saca(new BigDecimal("1500.05"));
		conta2.deposita(conta, new BigDecimal("10000.50"));
	

		System.out.println(cliente);
		System.out.println(cliente2);

	}
}
