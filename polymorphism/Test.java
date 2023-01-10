package polymorphism;

public class Test {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Lawyer lawyer = new Lawyer();
		Secreatry secreatry = new Secreatry();
		LegalSecreatry legalsecreatry = new LegalSecreatry();
		Marketer marketer = new Marketer();
		
		System.out.println("The salary of lawyer is " +lawyer.getSalary());
		
		Employee[] employe = new Employee[10];
		employe[0] = lawyer;
		employe[1] = secreatry;
		employe[2] = marketer;
		employe[3] = legalsecreatry;
		
		Employee employe1 = new Lawyer();
		Employee employe2 = new Secreatry();
		Employee employe3 = new Marketer();
		Employee employe4 = new LegalSecreatry();
		
		System.out.println(employe3.getSalary());
		
		System.out.println(((Marketer)employe3).insideMarket());
	}

}
