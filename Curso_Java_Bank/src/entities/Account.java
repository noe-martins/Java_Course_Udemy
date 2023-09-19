package entities;

public class Account {
	//Attributes
	private int accountNumber;
	private String accountHolder;
	private double balance, initialDeposit;
	
	//Constructor
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.initialDeposit = initialDeposit;
		this.setBalance(initialDeposit);
	}

	public Account(int accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	//Special Methods
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	//Methods
	public void Deposit(Double value) {
		this.setBalance(this.getBalance() + value);
	}
	public String Withdraw(Double value) {
		if (this.getBalance() == 0.0 || this.getBalance() < value) {
			return "You don't have enough balance";
		} else {
			this.setBalance((this.getBalance() - value) - 5.00);
			return "Successful withdrawal";
		}
	}
	
	//toString
	@Override
	public String toString() {
		return "Update account data: \nAccount " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
