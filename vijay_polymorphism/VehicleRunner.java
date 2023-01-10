package vijay_polymorphism;

public class VehicleRunner {
	public static void main(String[] args) {
		Cars cars = new Cars();
		Aeroplane aeroplane = new Aeroplane();
		Boat boat = new Boat();
		
		cars.fuelType();
		cars.noOfSeats();
		cars.transportaionMode();
		cars.tyres();
		cars.useOfVehicle();
		
		System.out.println("*********");
		
		aeroplane.fuelType();
		aeroplane.noOfSeats();
		aeroplane.transportaionMode();
		aeroplane.tyres();
		aeroplane.useOfVehicle();
		
		System.out.println("&&&&&&&&&&");
		
		boat.fuelType();
		boat.noOfSeats();
		boat.transportaionMode();
		boat.tyres();
		boat.useOfVehicle();
		
		
	}

}
