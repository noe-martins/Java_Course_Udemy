package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Bank {

	public static void main(String[] args) {
		//HERANÇA
		Account conta = new Account(23, "Noé Martins", 1000.00);
		
		System.out.println(conta);
		
		Boolean statusTrasation = conta.withDraw(1200.00);
		if (!statusTrasation) {
			System.out.println("Valor superior ao contido no saldo");
		}
		
		BusinessAccount contaEmpresa = new BusinessAccount(22, "Ana Keulliny", 2000.00, 500.00);
		contaEmpresa.loan(400.00);
		System.out.println(contaEmpresa);
		
		
		//UPCASTING
		/*
		 * JÁ CRIA UMA CONTA SUPER INSTANCIANDO COM O TIPO DE CONTAS "FILHAS"
		 */
		Account acc1 = new BusinessAccount(12, "Ageu Sousa", 5000.00, 500.00);
		Account acc2 = new SavingsAccount(15, "Flávia Ribeiro", 10000.00, 0.01);
		
		System.out.println(acc1);
		System.out.println(acc2);
		
		//DOWNCASTING
		/*
		 * PARA ATUALIZAR A CONTA "acc2" DEVE SER FEITO O DOWNCASTING NELA CRIANDO OUTRA CONTA E APONTAR PARA "acc2"
		 */
		SavingsAccount acc3 = new SavingsAccount();
		// VERIFICAÇÃO SE A CONTA "acc2" (QUE É DO TIPO "Account") ESTÁ INSTANCIANDO UMA CONTA DO TIPO "SavingsAccount"
		if(acc2 instanceof SavingsAccount) {
			acc3 = (SavingsAccount)acc2;
			acc3.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println(acc3);
	}

}
