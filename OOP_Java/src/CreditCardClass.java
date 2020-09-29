//Defining the credit card class

public class CreditCardClass {
	// Instance variables
	private String customer; 		// customer full name
	private String bank; 			// bank name
	private String account; 		// account identifier for acc_number
	private int limit; 				// credit limit in rands
	protected double balance; 		// current balance in rands

	// Constructors:
	public CreditCardClass(String cust, String bk, String acnt, int lim, double initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}

	public CreditCardClass(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0); 	// zero set as default balance
	}

	// Accessor methods
	public String getCustomer() {
		return customer;
	}

	public String getBank() {
		return bank;
	}

	public String getAccount() {
		return account;
	}

	public int getLimit() {
		return limit;
	}

	public double getBalance() {
		return balance;
	}

	// Update/mutator methods
	public boolean charge(double price) {	 // make a charge
		if (price + balance > limit) 		 // if charge would surpass limit
			return false; 					 // refuse the charge
		// when the charge is successful
		balance += price; 					// update the balance
		return true; 						// all is good
	}

	public void makePayment(double amount) { // make a payment
		balance = balance - amount;
	}

	// Utility method to print a card's information
	public static void printSummary(CreditCardClass card) {
		System.out.println("Customer = " + card.customer);
		System.out.println("Bank = " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance); 	// implicit cast
		System.out.println("Limit = " + card.limit); 		// implicit cast
	}

}// end class
