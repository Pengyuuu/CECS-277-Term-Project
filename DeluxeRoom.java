/**
 * 
 * @author Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Creates a deluxe room
 *
 */

public class DeluxeRoom extends MotelRoom {

	/** Cost of the room */
    private static final double COST = 75.00;

    /**
     * Creates a deluxe room
     */
    public DeluxeRoom() {
        description = "Deluxe room";
    }

    /**
     * Returns the cost of the room
     */
    public double cost() {

        return COST;
    }

    /**
     * Returns a string detailing it's a deluxe room
     */
    @Override
    public String toString() {
        return "Deluxe room";
    }
}

