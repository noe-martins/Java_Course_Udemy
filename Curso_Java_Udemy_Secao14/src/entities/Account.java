package entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public Boolean withDraw(Double amount) {
		if (amount > this.balance) {
			return false;
		} else {
			setBalance(this.balance - amount);
			return true;
		}
	}
	
	public void doposit(Double amount) {
		setBalance(this.balance + amount);
	}
	
	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
}
