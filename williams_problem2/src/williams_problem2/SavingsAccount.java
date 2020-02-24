package williams_problem2;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double balance) {
		savingsBalance = balance;
	}
	
	private double calculateMonthlyInterest() {
		return savingsBalance*annualInterestRate/12;
	}
	
	public static void modifyInterestRate(double val) {
		annualInterestRate = val;
	}
	
	public double getSavingsBalance() {
		savingsBalance = savingsBalance + calculateMonthlyInterest();
		return savingsBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String toString() {
		return String.format("Balance: %.2f", getSavingsBalance());
	}
}
