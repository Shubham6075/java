package module2;

public class Arrays {
	public static void main(String[] args) {
		// one dimensional array
		int[] myArray = {12, 34, 54, 65, 76, 87};
		System.out.println(myArray[2]);
		System.out.println(myArray.length);
		System.out.println("*********");
		for (int k : myArray) {
			System.out.println(k);
		}
		System.out.println("############");

		// two-dimensional array
		int[][] mySecondArray = {
				{12, 23, 43, 54},
				{2, 9, 76, 8},
				{23, 46, 69, 89},
				{13, 45, 76, 0}
		};
		System.out.println(mySecondArray[3][0]);
		System.out.println(mySecondArray.length);
		System.out.println("$$$$$$$$$$$$$");

		for (int[] ints : mySecondArray) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@");
		// new array
		int[] Array = new int[5];
		Array[0]=12;
		Array[1]=45;
		Array[2]=65;
		Array[3]=67;
		Array[4]=56;
		for (int j : Array) {
			System.out.println(j);

		}
	}
}
