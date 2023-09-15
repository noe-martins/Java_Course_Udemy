package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MainProgram {
	private static Scanner reader;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		reader = new Scanner(System.in);
		
		double dollar_price = Double.parseDouble(textInput("What is the dollar price? "));
		double dollar_amount = Double.parseDouble(textInput("How many dollars will be bought? "));
		// Só precisou chamar a classe diretamente sem precisar instanciar
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.Converter(dollar_price, dollar_amount)));
		
	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return reader.nextLine();
	}

}
