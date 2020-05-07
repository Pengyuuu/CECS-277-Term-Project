
public class RoomFactory {

    public MotelRoom getRoom (String type) {
        MotelRoom roomType = null;

        if (type.equals("Basic"))
            roomType = new BasicRoom();
        else if (type.equals("Deluxe"))
            roomType = new DeluxeRoom();
        else if (type.equals("Suite"))
            roomType = new SuiteRoom();

        return roomType;
    }


    @Override
    public String toString() {
        return "";
    }
}
