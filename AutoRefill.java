
public class AutoRefill extends AmenityDecorator {
	MotelRoom room;
	
	public AutoRefill(MotelRoom room) {
		
		this.room = room;
	}
	
	public String getDescription() {
		
		return room.getDescription() + " with autorefill";
	}
	
	public double cost() {
		
		return room.cost() + 5;
	}
}
