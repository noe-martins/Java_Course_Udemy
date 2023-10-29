package matriz;

import java.util.Scanner;

public class Aula103_Ex {
	
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
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == X) {
					System.out.println("\nPosition " + i + "," + j + ":");
					position(i, j, matriz, M, N);
				}
			}
		}
		
		sc.close();
		

	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
	
	private static void position(int i, int j, int[][] matriz, int linhas, int colunas) {
		int linha = linhas-1;
		int coluna = colunas-1;
		
		//NÚMEROS DAS PONTAS DA MATRIZ
		if (i == 0 && j == 0) {
			System.out.println("Right: " + matriz[i][j+1]);
			System.out.println("Down: " + matriz[i+1][j]);
		} 
		if (i == linha && j == 0) {
			System.out.println("Up: " + matriz[linha-1][j]);
			System.out.println("Right: " + matriz[linha][j+1]);
		} 
		if (i == 0 && j == coluna) {
			System.out.println("Left: " + matriz[i][j-1]);
			System.out.println("Down: " + matriz[i+1][j]);
		} 
		if (i == linha && j == coluna) {
			System.out.println("Up: " + matriz[linha-1][j]);
			System.out.println("Left: " + matriz[linha][j-1]);
		}
		
		//NÚMEROS DOS CANTOS
		if (i == 0) {
			System.out.println("Left: " + matriz[i][j-1]);
			System.out.println("Right: " + matriz[i][j+1]);
			System.out.println("Down: " + matriz[i+1][j]);
		}
		if (i == linha) {
			System.out.println("Up: " + matriz[i-1][j]);
			System.out.println("Left: " + matriz[i][j-1]);
			System.out.println("Right: " + matriz[i][j+1]);
		}
		if (j == 0) {
			System.out.println("Up: " + matriz[i-1][j]);
			System.out.println("Right: " + matriz[i][j+1]);
			System.out.println("Down: " + matriz[i+1][j]);
		}
		if (j == coluna) {
			System.out.println("Up: " + matriz[i-1][j]);
			System.out.println("Left: " + matriz[i][j-1]);
			System.out.println("Down: " + matriz[i+1][j]);
		}
		
		//NÚMEROS DO MEIO
		if ((i > 0 && i < linha) && (j < 0 && j < coluna)) {
			System.out.println("Up: " + matriz[i-1][j]);
			System.out.println("Right: " + matriz[i][j+1]);
			System.out.println("Left: " + matriz[i][j-1]);
			System.out.println("Down: " + matriz[i+1][j]);
		}
	}

}
