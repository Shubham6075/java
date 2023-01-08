package module3;

public class Square {

	public float side;

	public Square(){

	}
	public Square(float length){
		side = length;
	}

	public float getPerimeter(){
		float perimeter = 4*side;
		return perimeter;
	}
	public float getArea(){
		float Area = side*side;
		return Area;
	}

}
