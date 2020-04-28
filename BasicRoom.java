public class BasicRoom extends MotelRoom {

    private static final double COST = 50.00;

    public BasicRoom() {
        description = "Chocolate Ice Cream";
    }

    public double cost() {

        return COST;
    }

    @Override
    public String toString() {
        return "";
    }
}
