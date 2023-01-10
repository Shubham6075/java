package shubham;

public class AlphabetR {

	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= 10; i++) {

				if (i == 1 || j == 1 || i == 10 && j < 6 || j == 5 || i == j && j > 5) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
