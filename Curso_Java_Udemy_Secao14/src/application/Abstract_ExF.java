package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Abstract_ExF {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		int numberTaxPayers = Integer.parseInt(textInput("Enter the number of tax payers: "));
		for (int i = 0; i < numberTaxPayers; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			String choice = textInput("Individual or company (i/c): ");
			String name = textInput("Name: ");
			Double anualIncome = Double.parseDouble(textInput("Anual income: "));
			if (choice.equalsIgnoreCase("i")) {
				Double healthExpenditures = Double.parseDouble(textInput("Health expenditures: "));
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
			} else if(choice.equalsIgnoreCase("c")){
				Integer numberOfEmployees = Integer.parseInt(textInput("Number of employees: "));
				taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		for (TaxPayer taxPayer : taxPayers) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
		}
		
		Double sumTaxes = 0.0;
		for (TaxPayer taxPayer : taxPayers) {
			sumTaxes += taxPayer.tax();
		}
		System.out.printf("\nTOTAL TAXES: $ %.2f", sumTaxes);
		
		leitor.close();
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
