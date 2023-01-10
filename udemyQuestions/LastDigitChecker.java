package udemyQuestions;

public class LastDigitChecker {
	public static void main(String[] args) {
		System.out.println(isValid(11));
		System.out.println(hasSameLastDigit(23, 43, 63));
	}

	public static boolean isValid(int num) {
		return (num > 9) && (num < 1001);
	}

	public static boolean hasSameLastDigit(int a, int b, int c) {
		if (isValid(a) && isValid(b) && isValid(c)) {
			a %= 10;
			b %= 10;
			c %= 10;
			return (a == b) || (a == c) || (b == c);
		}
		return false;
	}

}
