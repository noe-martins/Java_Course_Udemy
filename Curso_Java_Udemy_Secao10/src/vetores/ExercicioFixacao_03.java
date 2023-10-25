package vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class ExercicioFixacao_03 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int N = Integer.parseInt(textInput("Digite a quantidade de pessoas: "));
		Pessoa[] pessoas = new Pessoa[N];
		Double somaAltura = 0.0;
		int somaIdade = 0;
		
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			String nome = textInput("Nome: ");
			int idade = Integer.parseInt(textInput("Idade: "));
			Double altura = Double.parseDouble(textInput("Altura: "));
			//Criar um objeto em cada elemento do vetor
			pessoas[i] = new Pessoa(nome, idade, altura);
			somaAltura += altura;
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				somaIdade += 1;
			}
		}
		
		System.out.printf("Altura média: %.2f\n", (somaAltura/N));
		System.out.printf("Pessoas com menos de 16 anos: %.1f", (double)somaIdade/N * 100);
		System.out.print("%\n");
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
