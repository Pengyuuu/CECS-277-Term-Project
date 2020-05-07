public class BasicRoom extends MotelRoom {

    private static final double COST = 50.00;

    public BasicRoom() {

        description += "Basic room";
    }

    public double cost() {

        return COST;
    }

    @Override
    public String toString() {
        return "Basic room";
    }
}
