package module3;

public class SquareRun {
	public static void main(String[] args) {

		Square s1 = new Square();
		s1.side = 20;

		System.out.println("S1 Perimeter :" +s1.getPerimeter());
		System.out.println("S1 Area :" + s1.getArea());

		Square s2 = new Square(25.0f);
		System.out.println("S2 Perimeter : " +s2.getPerimeter());
		System.out.println("S2 Area : " +s2.getArea());
	}
}
