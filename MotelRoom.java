import java.util.ArrayList;

public abstract class MotelRoom {

    protected String description;
    private double total;
   // private ArrayList amenities;




    public String getDescription() { return description; }


    public void addAmenities(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "foodbar") {
                new FoodBar(this);
            }
            else if (list.get(i) == "spa") {
                new Spa(this);
            }
            else if (list.get(i) == "autorefill") {
                new AutoRefill(this);
            }
            else if (list.get(i) == "shower") {
                new SprayResistantShower(this);
            }
        }

    }

    public double calculateTotal(){
        total = this.cost();
        return total;
    }

    public void pay (PaymentStrategy paymentMethod){
        double amount = calculateTotal();
        //System.out.println(this.calculateTotal());
        paymentMethod.pay(amount);

    }

    public abstract double cost();

}
