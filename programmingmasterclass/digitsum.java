package programmingmasterclass;

public class digitsum {
	public static void main(String[] args) {
		System.out.println("Digit sum is " +sumDigit(125));
		System.out.println("Digit sum is " +sumDigit(-125));
		System.out.println("Digit sum is " +sumDigit(6));
		System.out.println("Digit sum is " +sumDigit(1234));
		System.out.println("Digit sum is " +sumDigit(456738));
		
		
	}
	private static int sumDigit(int number) {
		if (number<10) {
			return -1;
		}
		int sum =0;
		while(number>0) {
			int digit = number % 10;
			sum = sum+digit;
			number = number/10;
		}
		return sum;
		
	}

}
