public class DeluxeRoom extends MotelRoom {

    private static final double COST = 75.00;

    public DeluxeRoom() {
        description = "Deluxe room";
    }

    public double cost() {

        return COST;
    }

    @Override
    public String toString() {
        return "Deluxe room";
    }
}

