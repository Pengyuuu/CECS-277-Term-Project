
public class SprayResistantShower extends AmenityDecorator {

	MotelRoom room;
	
	public SprayResistantShower () {
		
	}

	public SprayResistantShower (MotelRoom room) {

		this.room = room;
	}
	
	public String getDescription() {
		
		return room.getDescription() + " with a spray resistant shower";
	}
	
	public double cost() {
		
		return room.cost() + 25;
	}
}
