package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula88_Ex1 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		int N = Integer.parseInt(textInput("Quantas pessoas para ler a altura: "));
		Double cont = 0.0;
		Double[] alturas = new Double[N];
		
		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = Double.parseDouble(textInput("Digite a altura da pessoa " + i + ": "));
			cont += alturas[i];
		}
		
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Altura da Pessoa " + i + ": " + alturas[i]);
		}
		
		System.out.println("A médias das alturas é: " + String.format("%.2f", (cont/N)));
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
