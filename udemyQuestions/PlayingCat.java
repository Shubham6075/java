package udemyQuestions;

public class PlayingCat {
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 34));
	}

	public static boolean isCatPlaying(boolean summer, int temparature) {
		int upperLimit = summer ? 45 : 35;
		return temparature >= 25 && temparature <= upperLimit;

	}
}