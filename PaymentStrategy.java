/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Gives a way to pay	
 */

public interface PaymentStrategy {

	/**
	 * Amount to pay
	 * @param n	payment amount
	 */
    public void pay(double n );
}
