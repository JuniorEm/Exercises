package br.cefetpi.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int op = 0;
		
		ClienteListDAO cld = new ClienteListDAO();
		Scanner scanner = new Scanner(System.in);
		Cliente c1 = new Cliente(1, "12345678911", "Miltão", "1234-5678", 15044);
		Cliente c2 = new Cliente(2, "32456723912", "Mestre", "3906-7433", 16000);
		Cliente c3 = new Cliente(3, "33333333333", "MariaDB", "3901-5172", 13000);
		Cliente c4 = new Cliente(4, "11111111111", "Morgana", "3905-4443", 5800);
		Cliente c5 = new Cliente(5, "00000000000", "MariaPostGre", "3901-9716", 6000);
		Cliente c6 = new Cliente(6, "00000000550", "MariaPostGre", "3903-9716", 18000);
		
		
		cld.save(c1);
		cld.save(c2);
		cld.save(c3);
		cld.save(c4);
		cld.save(c5);
		cld.save(c6);

		//cld.delete(c1);
		//cld.delete(1);
		//cld.delete(c2);
		
		//System.out.println(cld.findByName("Garia"));
		
		/*
		//System.out.println(cld.findById(4));
		//System.out.println(cld.findByCpf("11111111111"));
		 * 
		 */
		//System.out.println(cld.findById(1));
		//System.out.println(cld.findByName("MariaPostGre"));
		//System.out.println(cld.findByCpf("00010000550"));
		//System.out.println(cld.find());
		
		//System.out.println(cld.teCopiei());
		
		
		System.out.println(cld.findById(7));
		
		/*
		System.out.println("Menu - Conjunto de opções: ");
		System.out.println("\n1 - Inserir Cliente");
		System.out.println("2 - Obtenha um CPF e remova o cliente que possui esse CPF");
		System.out.println("3 - Obtenha um CPF e exiba o cliente que possui esse CPF");
		System.out.println("4 - Obtenha um ID e exiba o cliente que possui esse ID");
		System.out.println("5 - Exiba todos os clientes");
		System.out.println("6 - Busca avançada por Nome");
		System.out.println("7 - Sair da Aplicação");
		
	
		while (scanner.hasNextInt()) {
			switch(op) {
			case 1: cld.save(c1); break;  
			case 2: System.out.println(cld.findByCpf("00000000000"));
			case 3: return;
			case 4: return;
			case 5: System.out.println(cld.find()); return;
			case 6: return;
			case 7: return;
		}
		}*/
		
		
	}
		
		
		
		
		
		
		
	}


