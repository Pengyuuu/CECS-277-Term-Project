/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Suite type room
 */

public class SuiteRoom extends MotelRoom {

	/** Cost of the room */
    private static final double COST = 100.00;

    /**
     * Creates a suite
     */
    public SuiteRoom() {
        description = "Suite";
    }

    /**
     * Gives cost of the room
     * @return cost of the room
     */
    public double cost() {

        return COST;
    }

    /**
     * Prints out a string detailing it's a suite
     */
    @Override
    public String toString() {
        return "Suite";
    }
    
}
