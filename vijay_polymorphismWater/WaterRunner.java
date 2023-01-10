package vijay_polymorphismWater;

public class WaterRunner {
	public static void main(String[] args) {
		BathingWater bathing = new BathingWater();
		DrinkingWater drinking = new DrinkingWater();
		FarmingWater farming = new FarmingWater();
		GlaciersWater glaciers = new GlaciersWater();
		SeverageWater severage = new SeverageWater();
		
		bathing.colour();
		bathing.movenment();
		bathing.state();
		bathing.temprature();
		bathing.origin();
		bathing.colour(7,"acidic");
		bathing.movenment("running","good");
		
		drinking.colour();
		drinking.movenment();
		drinking.state();
		drinking.temprature();
		drinking.origin();
		
		farming.colour();
		farming.movenment();
		farming.state();
		farming.temprature();
		farming.origin();
		
		glaciers.colour();
		glaciers.movenment();
		glaciers.state();
		glaciers.temprature();
		glaciers.origin();
		
		severage.colour();
		severage.movenment();
		severage.state();
		severage.temprature();
		severage.origin();
	}

}
