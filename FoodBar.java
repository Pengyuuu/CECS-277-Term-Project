
public class FoodBar extends AmenityDecorator {

	MotelRoom room;
	
	public FoodBar() {
		
	}

	public FoodBar(MotelRoom room) {

		this.room = room;
	}
	
	public String getDescription() {
		return room.description + " with food bar";
	}
	
	public double cost() {
		
		return room.cost() + 10;
	}
}
