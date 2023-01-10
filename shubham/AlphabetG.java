package shubham;

public class AlphabetG {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				if (i == 1 || j == 1 || i == 10 || j == 10 && i > 7 || i == 7 && j > 6) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
