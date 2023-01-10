package vijay_polymorphismWater;

public class BathingWater extends Water {
	@Override
	public void state() {
		System.out.println("State is liquid");
	}

	@Override
	public void origin() {
		System.out.println("origin is river");

	}

	@Override
	public void colour() {
		System.out.println("colour is white");
	}

	@Override // overriding
	public void temprature() {
		System.out.println("temprature is normal");
	}

	@Override
	public void movenment() {
		System.out.println("movenment is on");
	}

	public void colour(int ph, String type) { // overloading
		System.out.println("Ph of water is " + ph + " & " + type);
	}

	public void movenment(String freshwater, String smell) {
		System.out.println("movenment is " + freshwater + " & " + smell);
	}

}
