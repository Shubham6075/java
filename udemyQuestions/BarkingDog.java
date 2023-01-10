package udemyQuestions;

public class BarkingDog {
	public static void main(String[] args) {
		System.out.println(shouldWakeup(false, 6));
	}

	public static boolean shouldWakeup(boolean barking, int hourOfDay) {
		if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
			return false;
		}
		return true;
	}
}