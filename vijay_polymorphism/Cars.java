package vijay_polymorphism;

public class Cars extends Vehicle{
	@Override
	public void tyres() {
	    System.out.println("car has 4 tyres");
		}
	@Override
		public void noOfSeats() {
			System.out.println("car has 5 seats");
		}
	@Override
		public void transportaionMode() {
			System.out.println("cars run on road");
		}
	@Override
		public void fuelType() {
			System.out.println("car uses petrol");
		}
	@Override
		public void useOfVehicle() {
			System.out.println("car is used personnaly");
		}
	

}
