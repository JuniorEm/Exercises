package br.com.inter.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import br.com.inter.modelo.Pessoa;
import br.com.inter.modelo.PessoaFisica;
import br.com.inter.modelo.PessoaJuridica;

public class TesteMain {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		Map mapaDePessoa = new HashMap();
		mapaDePessoa.put("PF", new PessoaFisica());
		mapaDePessoa.put("PJ", new PessoaJuridica());
		System.out.println("Digite o tipo: ");
		String tipo;
		try {
			tipo = br.readLine();
			try {
				Pessoa pessoa =  (Pessoa) mapaDePessoa.get(tipo);
				pessoa.imprime();
				br.close();
			} catch (RuntimeException e) {
				throw new RuntimeException("Tipo não registrado! " + e);
			}
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o tipo!" + e);
		}
		
		
	}
}
