/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Creates a motel room for a roach colony to live in with amenities
 */

import java.util.ArrayList;

public abstract class MotelRoom {

	/** Roach colony to occupy the room */
    private RoachColony rc;
    
    /** Description of room */
    protected String description;
    
    /** Cost of the room */
    private double total;

    /**
     * Gets description of the room
     * @return	description of room
     */
    public String getDescription() { return description; }

    /**
     * Adds amenities to a room
     * @param list	list of amenities
     * @param rm	room where the amenities are being added
     * @return		room with amenities
     */
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
    
    /**
     * Puts a roach colony into a room
     * @param r	roach colony waiting to move in
     */
    public void setRoachCol(RoachColony r) {
        rc = r;
    }

    /**
     * Returns the roach colony occupying the room
     * @return	roach colony occupying the room
     */
    public RoachColony getRoachCol() {
        return rc;
    }

    /**
     * Calculates the price of their stay
     * @param days	amount of days they're staying
     * @return		cost of the room
     */
    public double calculateTotal(int days){
        total = this.cost() * days;
        return total;
    }

    /**
     * How the roaches will be paying
     * @param paymentMethod	method of payment
     */
    public void pay (PaymentStrategy paymentMethod){
        paymentMethod.pay(total);
    }

    /**
     * Prints out a descriptive statement
     */
    @Override
    public String toString() {
        return this.getDescription() + " " +  this.cost();
    }

    /**
     * Price of the room
     * @return	price of the room
     */
    public abstract double cost();

}
