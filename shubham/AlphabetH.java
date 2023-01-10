package shubham;

public class AlphabetH {
	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {

			for (int j = 1; j <= 10; j++) {

				if (j == 1 || i == 6 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
