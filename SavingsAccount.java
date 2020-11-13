
public class SavingsAccount extends BankAccount {

	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;

	/**
	 * Constructor
	 * @param name - name of the customer
	 * @param amount - balance Savings account
	 */
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	/**
	 * Copy constructor
	 * @param oldAccount SavingsAccount
	 * @param amount balance savings account
	 */
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		this.accountNumber = super.getAccountNumber() + "-" + ++savingsNumber;
	}

	/**
	 * Calculate one month's worth of interest on the balance 
	 * and deposit it into the account
	 */
	public void postInterest() {
		super.deposit(super.getBalance() * (rate/12));
	}

	/**
	 * Override getAccountNumber method from the superclass
	 */
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
}
