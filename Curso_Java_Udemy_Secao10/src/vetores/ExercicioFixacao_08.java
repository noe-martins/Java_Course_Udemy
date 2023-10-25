package vetores;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * 	Problema "media_pares" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java
	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
	aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
	digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

 */
public class ExercicioFixacao_08 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Random random = new Random();
		Double soma = 0.0;
		
		int N = Integer.parseInt(textInput("Digite quantos elementos terá o vetor: "));
		int[] vetor = new int[N];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(50);
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Número " + (i+1) + ": " + String.format("%d", vetor[i]));
		}
		
		if (soma == 0.0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			System.out.printf("MÉDIA DOS PARES: %.1f", soma/N);
		}

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
