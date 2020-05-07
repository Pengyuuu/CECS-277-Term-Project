/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Decorates the motel rooms
 */

public class Spa extends AmenityDecorator {

	/** Room to be decorated */
	MotelRoom room;
	
	/**
	 * Default constructor
	 */
	public Spa() {
		
	}

	/**
	 * Adds a spa to a room
	 * @param room	room that the spa will be added to
	 */
	public Spa (MotelRoom room) {

		this.room = room;
	}
	
	/**
	 * Adds a spa to the room's description
	 */
	public String getDescription() {
		
		return room.getDescription() + ", with a spa ";
	}
	
	/**
	 * Adds 20 dollars to the room's cost
	 */
	public double cost() {
		
		return room.cost() + 20;
	}

	/**
	 * Prints out a string detailing it's a spa
	 */
	@Override
	public String toString() {
		return "Spa";
	}
}
