package udemyQuestions;

public class EqualSumChecker {
	public static void main(String[] args) {
		System.out.println(hasEqualSum(5, 10, 15));
		System.out.println(hasEqualSum(1, -1, 0));

	}

	public static boolean hasEqualSum(int a, int b, int c) {
		if (c == a + b) {
			return true;
		}
		return false;
	}

}
