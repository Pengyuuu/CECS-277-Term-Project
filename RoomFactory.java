public class RoomFactory {

    public MotelRoom getRoom(String type) {
        MotelRoom roomType = null;

        if (type.equals("Regular"))
            roomType = new BasicRoom();
        else if (type.equals("Deluxe"))
            roomType = new DeluxeRoom();
        else if (type.equals("Sweet"))
            roomType = new SuiteRoom();

        return roomType;
    }
}
