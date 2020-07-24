import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

		// Prompt to enter number
		int x;
		System.out.println("Enter a number greater than 2: ");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();

		// Error message if wrong number entered
		while (x < 2) {
			System.out.println("ERROR: Number is less than 2.");
			System.out.println("Enter a number greater than 2: ");
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
		}

		// Make number even if it isn't
		int y = x;

		if (x % 2 != 0) {
			y = x - 1;
		}

		// Determine sum of even integers between 2 and number
		int k;
		k = y / 2;
		int sum;
		sum = k * (k + 1);

		// Print out sum and original number
		System.out.println("The required sum: " + sum);
		System.out.println("Your number is: " + x);

		// Close scanner to prevent resource leaks
		scanner.close();

	}
}
