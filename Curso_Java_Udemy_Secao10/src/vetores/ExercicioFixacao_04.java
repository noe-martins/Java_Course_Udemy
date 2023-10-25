package vetores;

import java.util.Random;
import java.util.Scanner;

/**
 * Problema "numeros_pares" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java
	Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
	tela todos os números pares, e também a quantidade de números pares. 
 */
public class ExercicioFixacao_04 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Random random = new Random();
		int contadorPar = 0;
		
		int N = Integer.parseInt(textInput("Digite a quantidade de números: "));
		int[] numeros = new int[N];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(50);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + (i+1) + ": " + numeros[i]);
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				contadorPar += 1;
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + contadorPar);
		
		
		

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
