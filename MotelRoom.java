import java.util.ArrayList;

public abstract class MotelRoom {

    protected String description;
    private double total;
   // private ArrayList amenities;

    public String getDescription() { return description; }


    public void addAmenities(ArrayList list) {
        String adding = "";
        for (int i = 0; i < list.size(); i++) {
        	
            if (list.get(i).equals("foodbar")) {
                adding = new FoodBar(this).getDescription();
            }
            else if (list.get(i).equals("spa")) {
                adding = new Spa(this).getDescription();
            }
            else if (list.get(i).equals("refillbar")) {
                adding = new AutoRefill(this).getDescription();
            }
            else if (list.get(i).equals("shower")) {
                adding = new SprayResistantShower(this).getDescription();
            }
            description = adding;
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
