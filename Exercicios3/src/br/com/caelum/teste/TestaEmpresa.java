package br.com.caelum.teste;

import java.math.BigDecimal;

import br.com.caelum.modelo.Departamento;
import br.com.caelum.modelo.Empresa;
import br.com.caelum.modelo.Funcionario;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("Unilever");
		Departamento dep1 = new Departamento("Tecnologia da Informação");
		Departamento dep2 = new Departamento("Logística");
		Departamento dep3 = new Departamento("RH");
		Departamento dep4 = new Departamento("Administrativo");
		Departamento dep5 = new Departamento("Faturamento");
		Funcionario f1 = new Funcionario("Daniel Henrique Green", new BigDecimal("15900.5"), "19-05-2012");
		Funcionario f2 = new Funcionario("Henrique Guilherme Silva Menuci", new BigDecimal("25500.75"), "25-04-2010");
		Funcionario f3 = new Funcionario("Odair Fernando", new BigDecimal("18900.5"), "18-08-2011");
		Funcionario f4 = new Funcionario("Caio Miranda", new BigDecimal("9900.25"), "18-10-2009");
		Funcionario f5 = new Funcionario("Leozão Alves", new BigDecimal("30900.5"), "20-05-1990");
		
		empresa.adicionaDepartamento(dep1);
		empresa.adicionaDepartamento(dep2);
		empresa.adicionaDepartamento(dep3);
		empresa.adicionaDepartamento(dep4);
		empresa.adicionaDepartamento(dep5);
		System.out.println(empresa.getDepartamento());
		
		dep1.adiciona(f1);
		dep1.adiciona(f2);
		dep1.adiciona(f5);
		System.out.println(dep1.getFuncionarios());
		
		dep4.adiciona(f3);
		System.out.println(dep4.getFuncionarios());
		
		dep4.transfere(dep1, f3);
		System.out.println(dep4.getFuncionarios());
		
		dep3.adiciona(f4);
		System.out.println(dep3.getFuncionarios());
		
		System.out.println(dep1.getFuncionarios());
		
		dep1.aumento();
		
		System.out.println(dep1.getFuncionarios());
		
		System.out.println(dep3.getFuncionarios());
		
		
		
		
	}
}
