package vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class ExercicioFixacao_11 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		Double somaAltura = 0.0;
		int contHomem = 0, contMulher = 0;
		
		int N = Integer.parseInt(textInput("Digite a quantidade de pessoas: "));
		Pessoa[] pessoas = new Pessoa[N];
		
		for (int i = 0; i < pessoas.length; i++) {
			Double altura = Double.parseDouble(textInput("Altura da " + (i+1) + "a pessoa: "));
			String genero = textInput("Gênero da " + (i+1) + "a pessoa: ");
			pessoas[i] = new Pessoa(genero, altura);
		}
		
		Double menorAltura = pessoas[0].getAltura();
		Double maiorAltura = pessoas[0].getAltura();
		for (int i = 1; i < pessoas.length; i++) {
			if (pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
			if (pessoas[i].getAltura() > maiorAltura) {
				maiorAltura = pessoas[i].getAltura();
			}
		}
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].isGenero().equalsIgnoreCase("f")) {
				somaAltura += pessoas[i].getAltura();
				contMulher += 1;
			}
			if (pessoas[i].isGenero().equalsIgnoreCase("m")) {
				contHomem += 1;
			}
		}
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f\n", (somaAltura/contMulher));
		System.out.println("Número de homens = " + contHomem);
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
