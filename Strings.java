package module2;

public class Strings {
	public static void main(String[] args) {
		String str = "Welcome to java";

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());

		System.out.println(str.isEmpty());

		System.out.println(str.charAt(4));

		System.out.println(str.substring(4, 8));

		System.out.println(str.trim());

		System.out.println(toLower("ABCddE"));

		System.out.println(average(new int[]{1,2,3,4,5},5));

	}
	public static String toLower(String S){
		return S.toLowerCase();
	}
	public static String average(int A[] , int N) {
		float sum = 0;
		for(int i=0; i<N; i++)
		{
			sum += A[i];
		}
		System.out.print(sum +" ");
		String avg = String.format("%.2f",sum/N);

		return avg;
	}
}
