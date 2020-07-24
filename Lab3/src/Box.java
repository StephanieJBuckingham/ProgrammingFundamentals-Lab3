
public class Box {

	public static void main(String[] args) {

		// initialize variable size
		int size = 7;

		// invoke printBox method
		printBox(size);

	}

	// create method printBox
	private static void printBox(int size) {

		// initialize variables for row and column
		int j;
		int i;

		// for loop to create star rectangle
		for (i = 1; i <= size; i++) {

			for (j = 1; j <= size; j++) {

				System.out.print('*');
			}
			System.out.print("\n");

		}

	}
}
