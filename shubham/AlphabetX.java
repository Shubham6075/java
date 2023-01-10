package shubham;

public class AlphabetX {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				if (i + j == 11 || i == j) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
