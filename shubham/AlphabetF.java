package shubham;

public class AlphabetF {
	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= 10; i++) {

				if (i == 1 || j == 1 || j == 6) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}