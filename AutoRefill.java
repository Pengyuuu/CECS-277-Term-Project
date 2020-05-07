/**
 * 
 * @author Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Decorates a room with an auto refilling bar
 *
 */
public class AutoRefill extends AmenityDecorator {
	
	/** Room to be decorated */
	MotelRoom room;
	
	/**
	 * Decorates a room with an auto refill bar
	 * @param room	room to be decorated
	 */
	public AutoRefill(MotelRoom room) {
		
		this.room = room;
	}
	
	/**
	 * Adds an auto refill bar to a room's description
	 */
	public String getDescription() {
		
		return room.getDescription() + ", with auto refill";
	}
	
	/**
	 * Adds 5 dollars a room's cost
	 */
	public double cost() {
		
		return room.cost() + 5;
	}

	/**
	 * Prints a string detailing it's an auto refill bar
	 */
	@Override
	public String toString() {
		return "Auto refill.";
	}
}
