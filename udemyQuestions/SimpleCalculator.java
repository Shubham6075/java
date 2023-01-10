package udemyQuestions;

public class SimpleCalculator {
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(1);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());

	}

	private double firstNumber = 0;
	private double secondNumber = 0;

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}

	public double getSubtractionResult() {
		return firstNumber - secondNumber;
	}

	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	}

	public double getDivisionResult() {
		return (secondNumber == 0) ? 0 : firstNumber / secondNumber;
	}

}
