
public class Box {

	// initialize size variable
	public int size = 0;

	public static void main(String[] args) {

		// Create box
		Box box = new Box();

		// Set box size to 5
		box.size = 5;

		// Call printBox methods on our box object
		box.printBox();
		System.out.println();
		box.printBox('c');

	}
	
	//printBox method print star box 
	private void printBox() {

		//Nested for loops to create star rectangle
		for (int i = 0; i < size; i++) {
			{
				for (int j = 0; j < size; j++) {

					System.out.print('*');
				}
				System.out.print("\n");

			}
		}
	}

	//printBox Method to create c box 
	private void printBox(char c) {

		// Nested for loops to create c rectangle
		for (int i = 0; i < size; i++) {
			{
				for (int j = 0; j < size; j++) {

					System.out.print('c');
				}
				System.out.print("\n");

			}

		}
	}
}