package vetores;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/**
 *  Problema "maior_posicao" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java
	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
	o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
	considerando a primeira posição como 0 (zero). 
 */
public class ExercicioFixacao_05 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Random random = new Random();
		
		int N = Integer.parseInt(textinput("Digite a quantidade de números: "));
		Double[] numeros = new Double[N];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextDouble(50.0);
		}
		
		int maiorIndex = 0;
		Double maiorNumero = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				maiorIndex = i;
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + i + ": " + String.format("%.2f", numeros[i]));
		}
		
		System.out.printf("MAIOR VALOR = %.2f", maiorNumero);
		System.out.println("\nPOSIÇÃO DO MAIOR VALOR = " + maiorIndex);
		
		

	}
	private static String textinput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
