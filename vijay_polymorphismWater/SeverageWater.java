package vijay_polymorphismWater;

public class SeverageWater extends Water {
	@Override
	public void state() {
		System.out.println("State is liquid");
	}

	@Override
	public void origin() {
		System.out.println("origin is households");
	}

	@Override
	public void colour() {
		System.out.println("colour is different");
	}

	@Override
	public void temprature() {
		System.out.println("temprature is normal");
	}

	@Override
	public void movenment() {
		System.out.println("movenment is ongoing");
	}

}
