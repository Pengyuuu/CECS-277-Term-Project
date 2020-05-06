
public class FoodBar extends AmenityDecorator {

	MotelRoom room;
	
	public FoodBar(MotelRoom room) {
		
		this.room = room;
	}
	
	public String getDescription() {
		
		return room.getDescription() + " with food bar";
	}
	
	public double cost() {
		
		return room.cost() + 10;
	}
}
