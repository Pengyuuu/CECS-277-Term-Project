import java.util.ArrayList;

public abstract class MotelRoom {

    private RoachColony rc;
    protected String description;
    private double total;
    //private ArrayList amenities;



    public String getDescription() { return description; }


    public MotelRoom addAmenities(ArrayList list, MotelRoom rm) {

        for (int i = 0; i < list.size(); i++) {
        	
            if (list.get(i).equals("foodbar")) {
                rm = new FoodBar(rm);
            }
            else if (list.get(i).equals("spa")) {
                rm = new Spa(rm);
            }
            else if (list.get(i).equals("autorefill")) {
                rm = new AutoRefill(rm);
            }
            else if (list.get(i).equals("shower")) {
                rm = new SprayResistantShower(rm);

            }
        }
        return rm;
    }

    public void setRoachCol(RoachColony r) {
        rc = r;
    }

    public RoachColony getRoachCol() {
        return rc;
    }

    public double calculateTotal(int days){
        total = this.cost() * days;
        return total;
    }

    public void pay (PaymentStrategy paymentMethod){
        paymentMethod.pay(total);
    }

    @Override
    public String toString() {
        return this.getDescription() + " " +  this.cost();
    }

    public abstract double cost();

}
