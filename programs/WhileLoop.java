package programs;

public class WhileLoop {
	public static void main(String[] args) {
		int count = 1;
		while (count != 6) {
			System.out.println("count value is " + count);
			count++;
		}
		System.out.println("*************************");
		count = 1;
		while (true) {
			if (count == 6) {
				break;
			}
			System.out.println("count value is " + count);
			count++;
		}
	}

}
