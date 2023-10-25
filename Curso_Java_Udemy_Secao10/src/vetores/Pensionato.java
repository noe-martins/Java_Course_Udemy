package vetores;

import java.util.Scanner;
import entities.Reserva;

public class Pensionato {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		Reserva[] reservas = new Reserva[10];
		int[] vetorQuartos = new int[Integer.parseInt(textInput("How many rooms will be ranted? "))];
		
		for (int i = 0; i < vetorQuartos.length; i++) {
			System.out.println("\nRent #" + (i+1));
			String nome = textInput("Name: ");
			String email = textInput("Email: ");
			int quarto = Integer.parseInt(textInput("Room: "));
			reservas[quarto] = new Reserva(nome, email, quarto);
		}
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i] != null) {
				System.out.println(reservas[i]);
			}
		}

	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
