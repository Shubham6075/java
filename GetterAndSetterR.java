package module3;

public class GetterAndSetterR {
	public static void main(String[] args) {

		GetterAndSetter s = new GetterAndSetter();

		s.setName("Shubham");
		s.setAge(45);
		s.setColour("Fair");

		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getColour());
	}
}
