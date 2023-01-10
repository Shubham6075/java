package udemyQuestions;

public class BytesConvertor {
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(5000);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int megaBytes = kiloBytes / 1024;
			int myRemainder = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + myRemainder + " KB");
		}
	}

}


