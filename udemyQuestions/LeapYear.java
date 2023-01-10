package udemyQuestions;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2000));
	}

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;

		if (year < 9999 && year > 0) {
			isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		}
		return isLeapYear;
	}

}
