package matriz;

import java.util.Scanner;

public class Aula103_ExCorrect {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		int M = Integer.parseInt(textInput("Digite a quantidade de Linhas da Matriz: "));
		int N = Integer.parseInt(textInput("Digite a quantidade de Colunas da Matriz: "));
		int[][] matriz = new int[M][N];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		int X = Integer.parseInt(textInput("Digite o número de referência: "));
		
		System.out.println("\nMATRIZ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nPOSIÇÕES DO NÚMERO DE REFERÊNCIA");
		position(matriz, X);
		
		sc.close();

	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
	
	private static void position(int[][] matriz, int X) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == X) {
					System.out.println("\nPosition " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (i < matriz.length) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
	}

}
