import java.util.ArrayList;

public abstract class MotelRoom {

    protected String description;
    private double total;
   // private ArrayList amenities;

    public String getDescription() { return description; }


    public void addAmenities(ArrayList list, MotelRoom rm) {

        for (int i = 0; i < list.size(); i++) {
        	
            if (list.get(i).equals("foodbar")) {
                rm = new FoodBar(rm);
            }
            else if (list.get(i).equals("spa")) {
                rm = new Spa(rm);
            }
            else if (list.get(i).equals("refillbar")) {
                rm = new AutoRefill(rm);
            }
            else if (list.get(i).equals("shower")) {
                rm = new SprayResistantShower(rm);
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
