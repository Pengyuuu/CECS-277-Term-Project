public abstract class MotelRoom {

    protected String description;
    private double total;


    public String getDescription() { return description; }


    public void addAmenities() {

    }

    public double calculateTotal(){
        return total;
    }

    public abstract double cost();

}
