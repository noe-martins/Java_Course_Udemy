package vetores;

import java.util.Scanner;
import entities.Aluno;

/**
 * 	Problema "aprovados" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/aprovados.java
	Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
	no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
	os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
	igual a 6.0 (seis). 
 */
public class ExercicioFixacao_10 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		int N = Integer.parseInt(textInput("Digite a quantidade de alunos para cadastrar: "));
		Aluno[] alunos = new Aluno[N];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite o nome, primeira e seguna nota do " + (i+1) + "o aluno:");
			String nome = textInput("");
			Double notaA = Double.parseDouble(textInput(""));
			Double notaB = Double.parseDouble(textInput(""));
			alunos[i] = new Aluno(nome, notaA, notaB);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].media() >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
