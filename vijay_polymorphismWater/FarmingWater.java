package vijay_polymorphismWater;

public class FarmingWater extends Water{
	@Override
	public void state() {
		System.out.println("State is liquid");
		}
	@Override
	public void origin() {
		System.out.println("origin is groundwater");	
	}
	@Override
	public void colour() {
		System.out.println("colour is little brownish");
	}
	@Override
	public void temprature() {
		System.out.println("temprature is cool");
	}
	@Override
	public void movenment() {
		System.out.println("movenment is steady");
	}

}
