package programs;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight in kg");
		float weight = scanner.nextFloat();
		System.out.println("Enter the height in meters");
		float height = scanner.nextFloat();

		float bmi = (weight / (height * height));
		System.out.println(bmi);
	}

}
