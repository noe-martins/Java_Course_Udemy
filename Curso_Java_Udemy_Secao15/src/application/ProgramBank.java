package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class ProgramBank {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		Integer number = Integer.parseInt(textInput("Number: "));
		String holder = textInput("Holder: ");
		Double balance = Double.parseDouble(textInput("Initial balance: "));
		Double withdrawLimit = Double.parseDouble(textInput("Withdraw limit: "));
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		try {
			account.withdraw(Double.parseDouble(textInput("\nEnter amount for withdraw: ")));
			System.out.printf("New balance: %.2f", account.getBalance());
		}catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Error Detected");
			e.printStackTrace();
		}
		
		leitor.close();
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
