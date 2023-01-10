package oops;

public class OverloadingMethod {
	public static void main(String[] args) {
	
		double result2 = SumNumbers(1.5,2.3,0.1);
		
		int result1 = SumNumbers(14,2);
		
		System.out.println(result2);
		System.out.println(result1);
	}
	public static int SumNumbers(int x , int y) {
		int result = x+y;
		return result;
	}
	public static double SumNumbers(double x, double y , double z) {
		double result = x+y+z;
		return result;
	}

}
