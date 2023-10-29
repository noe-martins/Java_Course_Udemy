package matriz;

import java.util.Random;
import java.util.Scanner;

public class Aula102_Ex {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Random random = new Random();
		int contNegativo = 0;
		
		int N = Integer.parseInt(textInput("Digite a Ordem da Matriz: "));
		int[][] matriz = new int[N][N];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(20) - 10;
			}
		}
		
		System.out.println("\nMATRIZ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] < 0) {
					contNegativo++;
				}
			}
			System.out.println();
		}
		
		System.out.println("\nDIAGONAL PRINCIPAL");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE VALORES NEGATIVOS: " + contNegativo);
		

	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
