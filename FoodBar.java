/**
 * 
 * @author Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Decorates the room with a food bar
 *
 */

public class FoodBar extends AmenityDecorator {

	/** Room to be decorated */
	MotelRoom room;
	
	/**
	 * Default constructor for food bar
	 */
	public FoodBar() {
		
	}

	/**
	 * Decorates room with a food bar
	 * @param room	room to be decorated
	 */
	public FoodBar(MotelRoom room) {

		this.room = room;
	}
	
	/**
	 * Adds food bar to a room's description
	 */
	public String getDescription() {
		return room.description + ", with food bar ";
	}
	
	/**
	 * Adds cost of food bar to the room
	 */
	public double cost() {
		
		return room.cost() + 10;
	}

	/**
	 * Prints a string detailing it's a food bar
	 */
	@Override
	public String toString() {
		return "Food bar";
	}
}
