package br.com.estudomvc.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import br.com.estudomvc.modelo.Cliente;

public class Interface2 implements Interface {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("\n-----------------------------------------------------------------");
		System.out.println("Id: ---------------------------------------------------------------");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Nome: ---------------------------------------------------------------");
		String nome = br.readLine();
		System.out.println("Sobrenome: ---------------------------------------------------------------");
		String sobrenome = br.readLine();
		System.out.println("Estado: ---------------------------------------------------------------");
		String estado = br.readLine();
		System.out.println("Cidade: ---------------------------------------------------------------");
		String cidade = br.readLine();
		System.out.println("Rua: ---------------------------------------------------------------");
		String rua = br.readLine();
		System.out.println("CEP: ---------------------------------------------------------------");
		String cep = br.readLine();
		System.out.println("Email: ---------------------------------------------------------------");
		String email = br.readLine();
		System.out.println("Senha: ---------------------------------------------------------------");
		String senha = br.readLine();
		System.out.println("Cliente: (1) Varejo ou (2) Corporativo: ------------------------------");
		int option = Integer.parseInt(br.readLine());
		

	}
}
