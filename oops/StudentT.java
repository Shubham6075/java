package oops;                             // Encapsulation

public class StudentT {
	private String name;
	private int age;
	private String colour;
	private char sex;
	
	private void Eating() { System.out.println("Eating"); }
	public void Drinking() {System.out.println("Drinking"); }
	public void Running() { System.out.println("Running"); }
	
	public StudentT() {
		
	}
	public StudentT(String name, int age, String colour, char sex) {
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.sex = sex;
	}
	// getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getColour() {
		return colour;
	}
	public char getSex() {
		return sex;
	}
	// setters
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setColour(String newColour) {
		this.colour = newColour;
	}
	public void setSex(char newSex) {
		this.sex = newSex;
	}

}
