package udemyQuestions;

public class FloorTest {
	public static void main(String[] args) {
		FloorCarpet carpet = new FloorCarpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		FloorCalculator calculator = new FloorCalculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		carpet = new FloorCarpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new FloorCalculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());

	}

}
