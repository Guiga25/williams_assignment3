package williams_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	public static void main(String args[]) {
		quiz();
	}
	
	public static void quiz() {
		SecureRandom rand = new SecureRandom();
		Scanner scan = new Scanner(System.in);

		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		askQuestion(num1, num2);
		int ans;
		while(0 != 1) {
			ans = readResponse(scan);
			if (isAnswerCorrect(ans, num1, num2)) {
				displayCorrectResponse();
				break;
			}
			else {
				displayIncorrectResponse();
			}
		}
		scan.close();
	}
	
	public static boolean isAnswerCorrect(int ans, int num1, int num2) {
		if (ans == num1*num2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very good!");
	}
	
	public static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
	public static int readResponse(Scanner scan) {
		int res = scan.nextInt();
		return res;
	}
	
	public static void askQuestion(int num1, int num2){
		System.out.printf("How much is %d times %d? ", num1, num2);
	}
}
