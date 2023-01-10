package shubham;

public class AlphabetB {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<=10;j++) {
				
				if(i == 1 && j<=8 || j == 1 || i == 10 || j == 8 && i<=5 || i == 5 || j == 10 && i>5  ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

}
