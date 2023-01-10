package shubham;

public class AlphabetA {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= 10; i++) {

				if (j == 5 || i + j == 6 || i - j == 5 || i == 1 && j > 5 || i == 10 && j > 5) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
