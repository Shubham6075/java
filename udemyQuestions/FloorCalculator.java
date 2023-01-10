package udemyQuestions;

public class FloorCalculator {
	 private Floor floor;
	    private FloorCarpet carpet;
	 
	    public FloorCalculator(Floor floor, FloorCarpet carpet) {
	        this.floor = floor;
	        this.carpet = carpet;
	    }
	 
	    public double getTotalCost() {
	        return (floor.getArea() * carpet.getCost());
	    }

}
