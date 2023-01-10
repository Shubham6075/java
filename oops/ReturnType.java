package oops;

public class ReturnType {
	public static void main(String[] args) {
		
		int result = SumTwoNumbers(5,7);
			System.out.println(result);
		
	}
	public static int SumTwoNumbers(int x,int y) {
		int result = x+y;
		return result;
	}

}
