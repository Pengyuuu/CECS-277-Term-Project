
public class FoodBar extends AmenityDecorator {

	MotelRoom room;
	
	public FoodBar() {
		
	}

	public FoodBar(MotelRoom room) {

		this.room = room;
		//description = this.getDescription();
	}
	
	public String getDescription() {
		//description += "with food bar";
		return room.description + " with food bar";
	}
	
	public double cost() {
		
		return room.cost() + 10;
	}
}
