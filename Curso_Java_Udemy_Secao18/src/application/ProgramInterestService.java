package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.BrazilInterestService;
import model.service.InterestService;
import model.service.UsaInterestService;

public class ProgramInterestService {
	
	private static Scanner leitor;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		leitor = new Scanner(System.in);
		
		Double amount = Double.parseDouble(textInput("Amount: "));
		Integer months = Integer.parseInt(textInput("Months: "));
		InterestService br = new BrazilInterestService(2.0);
		InterestService usa = new UsaInterestService(1.0);
		
		System.out.println("Payment after " + months + " months in Brazil:\n" + String.format("%.2f", br.payment(amount, months)));
		System.out.println("Payment after " + months + " months in USA:\n" + String.format("%.2f", usa.payment(amount, months)));
		
		leitor.close();
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
