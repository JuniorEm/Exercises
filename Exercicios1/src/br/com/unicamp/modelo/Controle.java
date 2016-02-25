package br.com.unicamp.modelo;

import java.io.BufferedInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Controle {
	static int quantidade;
	static Pluviometro[] novoVetor = new Pluviometro[1000];
	static Pluviometro[] maisNovoVetor = new Pluviometro[1000];
	static Caminhao[] novoVetorCaminhao = new Caminhao[10];
	
	static InputStream is = System.in;
	static InputStreamReader isr = new InputStreamReader(is);
	static BufferedReader br = new BufferedReader(isr);
	static String decisao;
	
	
	public static String leString() {
		Pluviometro[] vetorTemp = new Pluviometro[novoVetor.length];
	
		System.out.println("Deseja cadastrar os caminhões?");
		try {
			decisao = br.readLine();
			if (decisao.equalsIgnoreCase("sim")) {
				while (decisao.equalsIgnoreCase("sim")) {
					
					for (int i = 0; i < novoVetor.length; i++) {
						if (novoVetor[i] != null) {
							novoVetor[i] = null;
						}
					}
					
					System.out.println("Escolha seu caminhão: (Alfa ou Beta)");
					String option;
					option = br.readLine();
					
					if (option.equalsIgnoreCase("alfa")) {
							CaminhaoAlfa caminhaoAlfa = new CaminhaoAlfa(Controle.leInteiro(), option);
							Controle.adicionaNoVetorCaminhao(caminhaoAlfa);
							Controle.inserePluviometroControle(caminhaoAlfa);
					} else {
						if (option.equalsIgnoreCase("beta")) {
							CaminhaoBeta caminhaoBeta = new CaminhaoBeta(option);
							Controle.inserePluviometroControle(caminhaoBeta);
							Controle.adicionaNoVetorCaminhao(caminhaoBeta);
					} else {
						if (option.equalsIgnoreCase("fim")) {
							br.close();
						} else {
							System.out.println("Opção inválida, tente novamente");
						}
					} 
				}
					
					System.out.println("Deseja cadastrar mais um caminhão?");
					decisao = br.readLine();
					if (decisao.equalsIgnoreCase("nao") || decisao.equalsIgnoreCase("não")) {
						for (Caminhao caminhao : novoVetorCaminhao) {
							if (caminhao != null) {
								System.out.println("Caminhões preparados " + "\n" + caminhao);
							}
						}
						
				
						System.out.println("Fim do Programa!");
						br.close();
					} else {
						if (decisao.equalsIgnoreCase("sim")) {
							decisao = "sim";
						} else {
							System.out.println("Valor passado inválido!");
						}
					}
				}
			} else {
				if (decisao.equalsIgnoreCase("nao") || decisao.equalsIgnoreCase("não")) {
					System.out.println("Fim do Programa!");
					br.close();
				} else {
					System.out.println("Valor inválido!");
				}	
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "Fim do Programa!";
	}

	public static int leInteiro() {
		
		System.out.println("Digite a quantidade a ser transportada: ");
		try {
			quantidade = Integer.parseInt(br.readLine());
			return quantidade;
		} catch (NumberFormatException e) {
			throw new RuntimeException("Impossível efetuar a formatação do número");
		} catch (IOException e) {
			throw new RuntimeException("Impossível ler a String");
		}
	}
	

	public static Pluviometro[] inserePluviometroControle(Caminhao caminhao) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int cont = 0;
		
		try {
			while (decisao.equalsIgnoreCase("sim")) {
					System.out.println("Digite o tipo para o Pluviômetro");
					String tipo = br.readLine();
					caminhao.inserePluviometro(new Pluviometro(tipo));
					Pluviometro[] novoVetor = caminhao.getCarregamento();
					cont++;
		
					System.out.println("Deseja continuar?");
					decisao = br.readLine();
					if (decisao.equalsIgnoreCase("nao") || decisao.equalsIgnoreCase("não")) {
						Pluviometro[] vetorTemp = new Pluviometro[novoVetor.length];
						vetorTemp = novoVetor;
						
						for (Pluviometro pluviometro : vetorTemp) {
							if (pluviometro != null) {
								System.out.println("Carga do caminhão " + caminhao.toString().toLowerCase()  + "\n" + pluviometro);
							}
						}
						
						return vetorTemp;
					}
				}
			} catch (IOException e) {
			e.printStackTrace();
		}
			return null;
	}
	
	public static void adicionaNoVetorPluviometro(Pluviometro pluviometro) {
		for (int i = 0; i < novoVetor.length; i++) {
			if (novoVetor[i] == null) {
				novoVetor[i] = pluviometro;
				break;
			}
		}
	}
	
	public static Pluviometro[] getVetor() {
		return novoVetor;
	}
	
	public static void adicionaNoVetorCaminhao(Caminhao caminhao) {
		for (int i = 0; i < novoVetorCaminhao.length; i++) {
			if (novoVetorCaminhao[i] == null) {
				novoVetorCaminhao[i] = caminhao;
				break;
			}
		}
	}
	
	public static Caminhao[] getVetorCaminhao() {
		return novoVetorCaminhao;
	}
	

	
}
