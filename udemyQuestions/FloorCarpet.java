package udemyQuestions;

public class FloorCarpet {
	 private double cost;
	 
	    public FloorCarpet(double cost) {
	        if(cost < 0) this.cost = 0;
	        else this.cost = cost;
	    }
	 
	     
		public double getCost() {
	        return cost;
	    }

}
