
public class Box {

	// initialize variable
	public int size = 0;

	public static void main(String[] args) {

		// Create box
		Box box = new Box();

		// Set box to 5
		box.size = 5;

		// Call printBox method on our box object
		box.printBox();
	}

	// create method printBox 
	private void printBox() {

		// for loop to create star rectangle
		for (int i = 0; i < size; i++) {
			{
				for (int j = 0; j < size; j++) {

					System.out.print('*');
				}
				System.out.print("\n");

			}
		}
	}
}

