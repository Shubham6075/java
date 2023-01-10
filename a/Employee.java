// static variables

package a;

public class Employee {
	int empid;
	String name;
	static String company = "Smart programming";
    Employee(int empid , String name){
    	this.empid = empid;
    	this.name = name;
    }
    void display() {
    	System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[] args) {
    	Employee e1 = new Employee(101,"Amit");
    	e1.display();
    	Employee e2 = new Employee(102,"Deepak");
    	e2.display();
    }
}
