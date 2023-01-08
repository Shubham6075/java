package module2;

public class ExceptionHandlings {
	public static void main(String[] args) {
		System.out.println("Program Starts");

		// single try -catch block
		int[] myArray = {12,34,3,76,15};
		try{
			System.out.println(myArray[33]);
		}catch(ArrayIndexOutOfBoundsException  exception){
			System.out.println(exception);
		}

		// multiple catch -block
        int[] my2Array = {12,23,34,45,56,78};
		try{
			int result = my2Array[2]/0;
			System.out.println(45);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
			System.out.println(exception);
		}
		try{
			String s = null;
			System.out.println(s.length());
		}catch(Exception ex){
			System.out.println(ex);
		}
		System.out.println("Program Ends");
	}
}
