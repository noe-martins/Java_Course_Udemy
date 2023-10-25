package vetores;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * 	Problema "abaixo_da_media" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/abaixo_da_media.java
	Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
	mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
	os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 */
public class ExercicioFixacao_07 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Random random = new Random();
		Double soma = 0.0;
		
		int N = Integer.parseInt(textInput("Digite a quantidade de elementos que terá o vetor: "));
		Double[] vetor = new Double[N];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextDouble(20.00);
			soma += vetor[i]; 
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Numero " + (i+1) + ": " + String.format("%.2f", vetor[i]));
		}
		
		System.out.printf("MEDIA DO VETOR = %.2f\n", (soma/N));
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < (soma/N)) {
				System.out.printf("%.2f\n", vetor[i]);
			}
		}

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
