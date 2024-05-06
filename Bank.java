public class Bank {

	public static void main(String...args) {

	Account mercyAccount = new Account();
	mercyAccount.deposit(1_200);
	int accountBalance = mercyAccount.checkBalance();

	System.out.println(accountBalance)

	Account mercyAccount = new Account();
	mercyAccount.deposit(1_200);
	int herAccountBalance = mercyAccount.checkBalance();

	System.out.println(herAccountBalance);
	}

}