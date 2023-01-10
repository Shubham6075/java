package oops;                                  // constructors
                                               // default & parameterized
 class Student {
	String name;
	int age;
	String colour;
	char sex ;
	
	public void Eating() {
		System.out.println("Eating");
	}
	public void Drinking() {
		System.out.println("Drinking");
	}
	public void Running() {
		System.out.println("Running");
	}
	
	public Student() {
		System.out.println("Constructor called");
		
	}
	
	public Student(String name,int age,String colour,char sex) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.sex = sex;
	}
	


}
