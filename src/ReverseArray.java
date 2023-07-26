import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		int[] userInput = new int[6];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter 6 numbers:");

		for (int i = 0; i < userInput.length; i++) {
			userInput[i] = scanner.nextInt();
		}

		System.out.println("The reverse order of the numbers are:");

		for (int i = userInput.length - 1; i >= 0; i--) {
			System.out.print(userInput[i] + " ");
		}

	}
}