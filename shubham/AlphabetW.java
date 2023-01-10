package shubham;

public class AlphabetW {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				if (i == j && i > 5 || i + j == 11 && i > 5 || j == 1 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
