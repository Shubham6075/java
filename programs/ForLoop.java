package programs;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 2; i < 9; i++) {
			System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000, i));
		}
		System.out.println("*************");
		for (int i = 8; i > 1; i--) {
			System.out.println("10000 at " + i + "% interest = " + calculateInterest(10000, i));
		}
		System.out.println("***************");
		System.out.println(isPrime(7));
		System.out.println("****************");

		int count = 0;
		for (int i = 10; i <= 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("Number" + i + "is a prime number");
			}
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
