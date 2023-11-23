package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}
	public BusinessAccount(Double loanLimit) {
		super();
		this.loanLimit = loanLimit;
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= this.loanLimit) {
			setBalance(getBalance() + (amount - 10.0));
		}
	}
	/*
	 * FEITO A SOBREPOSIÇÃO DO MÉTODO "withDraw"
	 * BOA PRÁTICA TORNAR OS MÉTODOS SOBREPOSTOS "final"
	 */
	@Override
	public final Boolean withDraw(Double amount) {
		if (super.withDraw(amount)) {
			setBalance(getBalance() - 2.0);
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", toString()=" + super.toString() + "]";
	}
	
}
