public class RoachColony {

    private String name;
    private int population;
    private double growth;

    public RoachColony(String n, int p, double g) {
        name = n;
        population = p;
        growth = g;
    }

    public void setPopulation(int pop) {
        population = pop;
    }

    public void setGrowth(double g) {
        growth = g;
    }

    public void setName (String n) {
        name = n;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowth() {
        return growth;
    }

    public String getName() {
        return name;
    }

    public void party() {

        population *= (growth);
    }



    @Override
    public String toString() {
        return this.name + " " + this.population;
    }


}
