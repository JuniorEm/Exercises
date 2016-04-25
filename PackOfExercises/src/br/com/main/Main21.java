package br.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main21 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DecimalFormat decimalFormat = new DecimalFormat("0.0");
		
		String entrada = br.readLine();
		String[] vetor = entrada.split(" ");
		double n1 = Double.parseDouble(vetor[0]) * 2;
		double n2 = Double.parseDouble(vetor[1]) * 3;
		double n3 = Double.parseDouble(vetor[2]) * 4;
		double n4 = Double.parseDouble(vetor[3]) * 1;
		String status = null;
		double media = (n1 + n2 + n3 + n4) / 10;
		
		
		
		if (media >= 5.0 && media <= 6.9) {
			double exame = Double.parseDouble(br.readLine());
			double resultadoFinal = (media + exame) / 2;
			
			if (resultadoFinal >= 5.0)
				status = "Aluno aprovado.";
			else status = "Aluno reprovado.";
			
			System.out.println("Media: " + decimalFormat.format(media).replace(",", ".") + "\nAluno em exame." + 
			"\nNota do exame: " + exame + "\n" + status + "\nMedia final: " + decimalFormat.format(resultadoFinal).replace(",", "."));
		} else if (media < 5.0) {
			status = "Aluno reprovado.";
			System.out.println("Media: " + decimalFormat.format(media).replace(",", ".") +
					"\n" + status);
		} else {
			status = "Aluno aprovado.";
			System.out.println("Media: " + decimalFormat.format(media).replace(",", ".") +
					"\n" + status);
		}
	}
}
