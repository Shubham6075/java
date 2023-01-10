package udemyQuestions;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
	}

	public static boolean isPerfectNumber(int number) {

		int sumOfProperDivisors = 0;

		for (int i = 1; i < number; i++)
			if (number % i == 0)
				sumOfProperDivisors += i;

		return sumOfProperDivisors == number && number > 1;

	}

}
