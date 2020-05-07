/**
 * 
 * @author Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Creates a basic type room
 *
 */

public class BasicRoom extends MotelRoom {

	/** Cost of the room */
    private static final double COST = 50.00;

    /**
     * Constructs a basic room
     */
    public BasicRoom() {

        description += "Basic room";
    }

    /**
     * Returns the cost of the room
     */
    public double cost() {

        return COST;
    }

    /**
     * Returns a string detailing it's a basic room
     */
    @Override
    public String toString() {
        return "Basic room";
    }
}
