package udemyQuestions;

public class MinutesToYearsDaysCalculator {
	public static void main(String[] args){
		printYearsAndDays(560000);
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long years = minutes / (60 * 24 * 365);
			long yearsRemaining = minutes % (60 * 24 * 365);
			long days = yearsRemaining / (60 * 24);
			System.out.println(minutes + " min " + "= " + years + " y and " + days + " d");
		}
	}

}
