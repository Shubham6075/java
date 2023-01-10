package vijay_polymorphismWater;

public class DrinkingWater extends Water {
	@Override
	public void state() {
		System.out.println("State is liquid");
	}

	@Override
	public void origin() {
		System.out.println("origin is Aaro/filter");
	}

	@Override
	public void colour() {
		System.out.println("colour is white");
	}

	@Override
	public void temprature() {
		System.out.println("temprature is normal");
	}

	@Override
	public void movenment() {
		System.out.println("movenment is still ");
	}

}
