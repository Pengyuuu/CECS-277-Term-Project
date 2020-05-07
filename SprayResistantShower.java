/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Decorates a room with a spray resistant shwoer
 */

public class SprayResistantShower extends AmenityDecorator {

	/** Room to be decorated */
	MotelRoom room;
	
	/**
	 * Default constructor
	 */
	public SprayResistantShower () {
		
	}

	/**
	 * Gets the room
	 * @param room	room to be decorated
	 */
	public SprayResistantShower (MotelRoom room) {

		this.room = room;
	}
	
	/**
	 * Adds a shower to the room's description
	 */
	public String getDescription() {
		
		return room.getDescription() + ", with a spray resistant shower ";
	}
	
	/**
	 * Adds 25 dollars to the room's cost
	 */
	public double cost() {
		
		return room.cost() + 25;
	}

	/**
	 * Prints out a statement detailing it's a shower
	 */
	@Override
	public String toString() {
		return "Spray resistant shower";
	}
}
