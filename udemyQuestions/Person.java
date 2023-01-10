package udemyQuestions;

public class Person {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName(""); // firstName is set to empty string
		person.setLastName(""); // lastName is set to empty string
		person.setAge(13);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John"); // firstName is set to John
		person.setAge(19);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith"); // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());
	}

	private String firstName;
	private String lastName;
	private int age = 0;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
		if (age < 0 || age > 100) {
			this.age = 0;
		} else {
			this.age = age;
		}

	}

	public boolean isTeen() {
		return (this.age > 12 && this.age < 20);
	}

	public String getFullName() {
		if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
			return "";
		} else if (this.firstName.isEmpty()) {
			return lastName;
		} else if (this.lastName.isEmpty()) {
			return firstName;
		}
		return firstName + " " + lastName;
	}
}
