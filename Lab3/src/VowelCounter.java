import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class VowelCounter {

	public static void main(String[] args) {

		// Prompt user to enter string
		System.out.println("Print a or word or phrase:");
		Scanner scan = new Scanner(System.in);
		String Input;
		Input = scan.nextLine();

		// close scanner
		scan.close();

		// Determine the length of the string
		int totalCount;
		totalCount = Input.length();

		// Initialize variables for each vowel count
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int spaceCount = 0;
		int nonVowelCount = 0;

		for (int i = 0; i < Input.length(); i++) {

			// Count a letters
			if (Input.charAt(i) == 'a') {
				aCount++;
			}

			// Count e letters
			if (Input.charAt(i) == 'e') {
				eCount++;
			}

			// Count i letters
			if (Input.charAt(i) == 'i') {
				iCount++;
			}

			// Count o letters
			if (Input.charAt(i) == 'o') {
				oCount++;
			}

			// Count u letters
			if (Input.charAt(i) == 'u') {
				uCount++;
			}

			// Count spaces in string
			if (Input.charAt(i) == ' ') {
				spaceCount++;
			}

		}

		// Total vowel count
		int totalVowels;
		totalVowels = aCount + eCount + iCount + oCount + uCount;

		// Determine non-vowel characters
		nonVowelCount = totalCount - spaceCount - totalVowels;

		// Print out results
		System.out.println("Total vowels in " + "\"" + Input + "\"" + " = " + totalVowels);
		System.out.println("Total non-vowel characters in " + "\"" + Input + "\"" + " = " + nonVowelCount);
	}
}
