package polymorphism;

public class LegalSecreatry extends Employee{
	public int getHours() {
		return 45;
	}
	public double getSalary() {
		return 5600.0;
	}
	public int getVacationDays() {
		return 5;
	}
	public void sayLegalOath() {
		System.out.println("My Legal Oath");
	}

}
