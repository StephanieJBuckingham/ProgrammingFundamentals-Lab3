import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {

		// Create random integer age
		int Age;
		Random gen = new Random();
		Age = gen.nextInt(100);

		// Scan in age guess
		int AgeGuess;
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess my age: ");
		AgeGuess = scan.nextInt();

		// Initialize string agenarrower
		String agenarrower;
		agenarrower = new String("older/younger");

		// while loop to narrow down age until correct
		while (Age != AgeGuess) {

			if (Age > AgeGuess) {
				agenarrower = "older";
			}

			if (Age < AgeGuess) {
				agenarrower = "younger";
			}

			System.out.println("Incorrect, my age is " + agenarrower + ".");
			System.out.println("Guess again: ");
			AgeGuess = scan.nextInt();

			if (Age == AgeGuess) {
				System.out.println("Correct, my age is " + Age + "!");
			}

		}
		// close scanner to prevent resource leaks
		scan.close();
	}
}
