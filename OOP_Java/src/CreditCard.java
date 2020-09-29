//This is a test class for the creditCardClass

public class CreditCard {

	public static void main(String[] args) {
		CreditCardClass[] wallet = new CreditCardClass[3];
		wallet[0] = new CreditCardClass("Vusi Ndlovu", "FNB", "5391 0375 9387", 5000);
		wallet[1] = new CreditCardClass("John Bate", "Capitec", "9 3395 1954", 3500);
		wallet[2] = new CreditCardClass("Marry Nkosi", "Std Bank", "375 9387 4409", 2500, 300);

		for (int val = 1; val <= 16; val++) {
			wallet[0].charge(3 * val);
			wallet[1].charge(2 * val);
			wallet[2].charge(val);
		} // end for

		for (CreditCardClass card : wallet) {
			CreditCardClass.printSummary(card); // calling static method
			while (card.getBalance() > 200.0) {
				card.makePayment(200);
				System.out.println("New balance = " + card.getBalance());
			}
		} // end for
	}// end main

}// end class
