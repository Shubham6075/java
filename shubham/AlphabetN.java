package shubham;

public class AlphabetN {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<=10;j++) {
				
				if(j==1 || j==10 || i==j) {
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
