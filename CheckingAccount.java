
public class CheckingAccount extends BankAccount{

	// Fee that represents the cost of clearing one check
	private static final double FEE = 0.15;

	/**
	 * Constructor
	 * @param name name of the customer
	 * @param amount balance checking account
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		this.setAccountNumber(super.getAccountNumber() + "-10");
	}

	/**
	 * Override withdraw method from the superclass
	 */
	@Override
	public boolean withdraw(double amount)
	{
		return super.withdraw(amount + FEE);
	}
}
