package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	private static Scanner reader;
	private static Account account;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		reader = new Scanner(System.in);
		
		//Data input
		int accountNumber = Integer.parseInt(textInput("Enter account number: "));
		String accountHolder = textInput("Enter account holder: ");
		String option = textInput("Is there na initial deposit? (y/n)? ");
		
		//builder verification
		if (option.equalsIgnoreCase("y")) {
			double initialDeposit = Double.parseDouble(textInput("Enter initial deposit value: "));
			account = new Account(accountNumber, accountHolder, initialDeposit);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
		//Data Initial
		System.out.println("\nAccount data:");
		System.out.println("Account " + account.getAccountNumber() + ", Holder: " + account.getAccountHolder() + ", Balance: $ " + String.format("%.2f", account.getBalance()));
		
		//Deposit
		account.Deposit(Double.parseDouble(textInput("\nEnter a deposit value: ")));
		System.out.println(account.toString());
		
		//Withdraw
		account.Withdraw(Double.parseDouble(textInput("\nEnter a withdraw value: ")));
		System.out.println(account.toString());
		
	}
	
	private static String textInput(String label) {
		System.out.print(label);
		return reader.nextLine();
	}
}
