/**
 * 
 * @author Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Another payment method for roaches
 *
 */

public class MasterRoach implements PaymentStrategy {

	/** Name of roach */
    private String name;
    
    /** Roach's card number */
    private String cardNum;
    
    /** Card's security code */
    private String cvv;
    
    /** Date card expires */
    private String dateOfExpiry;

    /**
     * Creates a new credit card
     * @param n		Name of roach
     * @param c		number of card
     * @param cv	security code
     * @param d		expiration date
     */
    public MasterRoach(String n, String c, String cv, String d) {
        name = n;
        cardNum = c;
        cvv = cv;
        dateOfExpiry = d;
    }

    /**
     * Receipt that the roach paid with the card
     */
    public void pay(double n) {
        System.out.println(n + " Paid with MasterRoach");

    }

    /**
     * Prints out a string detailing the card details
     */
    @Override
    public String toString() {
        return " MasterRoach card details: " + name;
    }


}
