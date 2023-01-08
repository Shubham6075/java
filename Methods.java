package module2;

public class Methods {
	public static void main(String[] args) {
		sum(45, 65);
		sum(26, 89);
		System.out.println(calculator(30, 15, 10));

		calculateInterest(10000, 4.5, 5);
		System.out.println("################");
		addition(34, 56);
		System.out.println("&&&&&&&");
		addition(45.8, 90.76, 146.87);
	}

	// no return type method
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("SUM IS : " + sum);
	}

	// return type method
	public static int calculator(int a, int b, int c) {
		return a * b * c;

	}

	// calculateInterest
	public static void calculateInterest(int principal, double interest, int year) {
		double si = principal * interest * year / 100;
		System.out.println(si);
	}

	// overloading methods
	public static void addition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void addition(double a, double b, double c) {
		double sum = a + b + c;
		System.out.println(sum);
	}

}
