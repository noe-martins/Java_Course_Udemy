package vetores;

import java.util.Random;
import java.util.Scanner;

/**
 * 	Problema "soma_vetores" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetores.java
	Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
	terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
	o vetor C gerado. 
 */
public class ExercicioFixacao_06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Digite a quantidade de valores que terão em cada vetor: ");
		int N = leitor.nextInt();
		int[] vetorA = new int[N];
		int[] vetorB = new int[N];
		int[] vetorC = new int[N];
		leitor.close();
		
		for (int i = 0; i < N; i++) {
			vetorA[i] = random.nextInt(50);
			vetorB[i] = random.nextInt(50);
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println("Valores do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
	}
	
}
