package udemyQuestions;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(45, 45));
	}

	public static boolean hasSharedDigit(int x, int y) {
		if ((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
			return false;
		} else {
			return ((x / 10 == y / 10) || (x / 10 == y % 10)
					|| (y / 10 == x % 10) || (x % 10 == y % 10));
		}
	}

}
