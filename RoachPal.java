/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Roach version of paypal they can pay with
 */

public class RoachPal implements PaymentStrategy {
	
	/** Roach's email for login */
    private String email;
    
    /** Name of the roach */
    private String name;

    /**
     * Creates a new RoachPal
     * @param e	roach's email
     * @param p	roach's name
     */
    public RoachPal(String e, String p) {
        email = e;
        name = p;
    }

    /**
     * Receipt of their payment
     */
    public void pay(double n) {
        System.out.println(n + " Paid with RoachPal " + this.email);

    }

    /**
     * Prints out roach's paypal details
     */
    @Override
    public String toString() {
        return " RoachPal email details: " + email;
    }
}
