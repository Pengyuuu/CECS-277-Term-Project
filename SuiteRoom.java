public class SuiteRoom extends MotelRoom {

    private static final double COST = 100.00;

    public SuiteRoom() {
        description = "Suite room";
    }

    public double cost() {

        return COST;
    }

    @Override
    public String toString() {
        return "";
    }
}
