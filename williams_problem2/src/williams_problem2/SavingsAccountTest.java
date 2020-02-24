package williams_problem2;

public class SavingsAccountTest {
	public static void main(String args[]) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
				
		SavingsAccount.modifyInterestRate(.04);
			System.out.println("          Acct 1:    Acct 2:");
		for(int i = 1; i<13; i++) {
			System.out.printf("Month %2d: %.2f    %.2f\n", i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
		}
		
		SavingsAccount.modifyInterestRate(.05);
		System.out.printf("The final balance of Month 13 in Account #1 is: %.2f\n", saver1.getSavingsBalance());
		System.out.printf("The final balance of Month 13 in Account #2 is: %.2f\n", saver2.getSavingsBalance());
	}
}

