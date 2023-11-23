package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class BankAmerican {

	public static void main(String[] args) {
		Account conta = new Account(25, "Noah Martins", 500.00);
		conta.withDraw(100.00);
		System.out.println(conta.getBalance());
		
		System.out.println();
		
		/*
		 * ------- "withDraw" SOBREPOSTO PARA NÃO TIRAR NADA NO TIPO DE CONTA "SavingsAccount" -------
		 * CRIEI A CONTA USANDO O UPCASTING
		 */
		Account conta2 = new SavingsAccount(23, "Noé Martins", 1000.00, 0.01);
		conta2.withDraw(100.00);
		System.out.println(conta2.getBalance());
		
		System.out.println();
		
		/*
		 * ------- "withDraw" SOBREPOSTO PARA TIRAR MAIS 2.00 NO TIPO DE CONTA "BusinessAccount" -------
		 * CRIEI A CONTA USANDO O UPCASTING
		 */
		Account conta3 = new BusinessAccount(20, "Ana Keulliny", 10000.00, 1000.00);
		conta3.withDraw(500.00);
		System.out.println(conta3.getBalance());
	}

}
