import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        int[] userInput = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter 6 numbers:");

        for (int i = 0; i < userInput.length; i++) {
            try {
				userInput[i] = scanner.nextInt();
			  //The exception that needs to be handled
            } catch (InputMismatchException e) {
                scanner.nextLine();
				System.out.println("Invalid input! Please enter a valid integer.");
				// Decrement i so that the next element now has this index
				i--;
				
            }
        }

        System.out.println("The reverse order of the numbers are:");

        for (int i = userInput.length - 1; i >= 0; i--) {
            System.out.print(userInput[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
