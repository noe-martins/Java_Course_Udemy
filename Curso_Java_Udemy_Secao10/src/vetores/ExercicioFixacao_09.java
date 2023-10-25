package vetores;

import java.util.Scanner;
import entities.Pessoa;

/**
 * 	Problema "mais_velho" 
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/mais_velho.java
	Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
	devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
	da pessoa mais velha. 
 */
public class ExercicioFixacao_09 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		int qtdPessoas = Integer.parseInt(textInput("Digite a quantidade de pessoas: "));
		Pessoa[] pessoas = new Pessoa[qtdPessoas];
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			String nome = textInput("Nome: ");
			int idade = Integer.parseInt(textInput("Idade: "));
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		int idadeVelho = 0;
		String nomeVelho = pessoas[0].getNome();
		for (int i = 1; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() > idadeVelho) {
				idadeVelho = pessoas[i].getIdade();
				nomeVelho = pessoas[i].getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeVelho);
		

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
