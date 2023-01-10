package vijay_polymorphismWater;

public class GlaciersWater extends Water {
	@Override
	public void state() {
		System.out.println("State is solid");
	}

	@Override
	public void origin() {
		System.out.println("origin is glaciers");
	}

	@Override
	public void colour() {
		System.out.println("colour is white");
	}

	@Override
	public void temprature() {
		System.out.println("temprature is low");
	}

	@Override
	public void movenment() {
		System.out.println("movenment is running");
	}

}
