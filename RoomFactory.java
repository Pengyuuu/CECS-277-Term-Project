/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Factory to create different kinds of rooms
 */
public class RoomFactory {

	/**
	 * Creates a room of a certain type
	 * @param type	type of room they want created
	 * @return
	 */
    public MotelRoom getRoom (String type) {
        MotelRoom roomType = null;

        if (type.equals("Regular"))
            roomType = new BasicRoom();
        else if (type.equals("Deluxe"))
            roomType = new DeluxeRoom();
        else if (type.equals("Suite"))
            roomType = new SuiteRoom();

        return roomType;
    }

    /**
     * Prints out the string room factory
     */
    @Override
    public String toString() {
        return "Room factory";
    }
}
