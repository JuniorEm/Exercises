package br.com.caelum.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TesteStream{
	public static void main(String[] args) {
		//InputStream is = new InputStream(); //Não é possível instanciar o InputStream por este ser uma classe abstrata
			/*try {
				InputStream is = new FileInputStream("arquivo.txt"); //// System.in permite o console ler a entrada para o teclado
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr); //Lê o Reader por pedaços usando o buffer
				try {
					String s = br.readLine();
					System.out.println(s);
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Impossível ler dados");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Arquivo não encontrado");
			} //InputStream que recebe um System.int (Entrada para o teclado)
*/
		
			try {
				InputStream is = new FileInputStream("arquivo.txt"); //// System.in permite o console ler a entrada para o teclado
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream os = new FileOutputStream("saida.txt");
				OutputStreamWriter osr = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osr);
				Scanner scanner = new Scanner(is); //Scanner deve receber um InputStream

				
				try {
					while (scanner.hasNextLine()) { //Pergunta se há uma linha na saída, e a lê <- Aqui o Scanner vai ler a entrada (arquivo.txt)
						//O Scanner recebe como parâmetro obrigatoriamente um InputStream
						String x = scanner.nextLine(); //Atribui a próxima linha numa String, isso funciona como um escaneamento
						bw.write(x);	//Escreve a linha escaneada (passou do arquivo.txt par o saida.txt)
						bw.newLine(); //Pula de linha, e repete o loop enquanto a condição existir
					}
						bw.close(); //Sempre se lembrar de fechar o buffer
				} catch (IOException e) {
					System.out.println("Erro de Entrada e Saída: Impossível escrever no arquivo");
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado");
			} 
		
		/*try {
		InputStream is = new FileInputStream("arquivo.txt"); //Lê do arquivo, com System.in podemos ler do teclado
		Scanner scanner = new Scanner(is); //Scanner recebe como parâmetro o is!
		
		System.out.println("Digite sua mensagem: ");
		while (scanner.hasNextLine()) { //Enquanto houver a próxima linha, então ele printa essa próxima linha
			System.out.println(scanner.nextLine());
		}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} */
		
	}

}
