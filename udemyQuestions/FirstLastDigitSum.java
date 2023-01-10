package udemyQuestions;

public class FirstLastDigitSum {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(92));
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int lastDigit = number % 10;
		while (number > 9) {
			number = number / 10;
		}
		return lastDigit + number;
	}

}
