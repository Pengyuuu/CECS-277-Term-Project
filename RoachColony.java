public class RoachColony {

    private String name;
    private int population;
    private double growth;

    public RoachColony(String n, int p, double g) {
        name = n;
        population = p;
        growth = g;
    }

    public void party() {
        population *= growth;
    }



    @Override
    public String toString() {
        return "";
    }


}
