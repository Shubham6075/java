package oops;

public class Method {
	public static void main(String[] args) {
		FirstMethod();
		String message = "Hello ! Rate us 5 stars";
		SecondMethod(message);
	}
	public static void FirstMethod() {
		System.out.println("Hello");
	}
    public static void SecondMethod(String message) {
    	System.out.println("" +message);
    }
}
