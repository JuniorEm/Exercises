package br.com.caelum.main;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.dao.BancoDao;
import br.com.caelum.modelo.Cliente;
import br.com.caelum.modelo.ContaCorrente;

public class TestaInsere {
	public static void main(String[] args) {
		BancoDao bDao = new BancoDao();
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setIdCliente(1);
		cc1.setNumeroDaConta(111115);
		cc1.setAgencia(4441);
		cc1.setSaldo(new BigDecimal(5000.5));
		cc1.setLimite(new BigDecimal(8000.75));
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Daniel Green");
		cliente2.setCpf("22222222222");
		cliente2.setRg("999999999");
		cliente2.setDataDeNascimento(Calendar.getInstance());
		
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setNumeroDaConta(11111116);
		cc2.setAgencia(1334);
		cc2.setSaldo(new BigDecimal(3000.50));
		cc2.setLimite(new BigDecimal(2000.75));
		cc2.setIdCliente(2);
		
		//bDao.saca(cc1, new BigDecimal(1000.50));
		//bDao.saca(cc1, new BigDecimal(3000.50));
		//bDao.saca(cc1, new BigDecimal(12200.5));
		//bDao.saca(cc1, new BigDecimal(0.5));
		
		
		//bDao.transfere(cc1, new BigDecimal(6000), cc2);
		//bDao.transfere(cc2, new BigDecimal(2000), cc1);
	
	}
}
