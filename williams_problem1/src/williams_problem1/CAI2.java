package williams_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	public static void main(String args[]) {
		quiz();
	}
	
	public static void quiz() {
		SecureRandom rand = new SecureRandom();
		Scanner scan = new Scanner(System.in);

		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		int seedCorrect, seedIncorrect;
		
		askQuestion(num1, num2);
		int ans;
		while(0 != 1) {
			ans = readResponse(scan);
			if (isAnswerCorrect(ans, num1, num2)) {
				seedCorrect = rand.nextInt(4)+1;
				displayCorrectResponse(seedCorrect);
				break;
			}
			else {
				seedIncorrect = rand.nextInt(4)+1;
				displayIncorrectResponse(seedIncorrect);
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
	
	public static void displayCorrectResponse(int seed) {
		switch(seed){
		case 1:
			System.out.println("Very good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
	}
	
	public static void displayIncorrectResponse(int seed) {
		switch(seed){
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		}
	}
	
	public static int readResponse(Scanner scan) {
		int res = scan.nextInt();
		return res;
	}
	
	public static void askQuestion(int num1, int num2){
		System.out.printf("How much is %d times %d? ", num1, num2);
	}
}

