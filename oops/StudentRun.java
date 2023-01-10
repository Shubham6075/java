package oops;

public class StudentRun {                             
		public static void main(String[] args) {
			Student student1 = new Student();
			System.out.println("Student1 name "+student1.name);

			Student student2 = new Student("John",18,"fair",'m');
			System.out.println("Student2 Name " +student2.name);
		}

	}


