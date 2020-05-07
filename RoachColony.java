/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Creates a roach colony with a population and their growth rate
 */

public class RoachColony {

	/** Name of colony */
    private String name;
    
    /** Population of colony */
    private int population;
    
    /** Growth of their population */
    private double growth;

    /**
     * Roach colony constructor
     * @param n	name of colony
     * @param p	population of colony
     * @param g	growth of colony
     */
    public RoachColony(String n, int p, double g) {
        name = n;
        population = p;
        growth = g;
    }

    /**
     * Sets the colony's population to a certain number
     * @param pop	new population of colony
     */
    public void setPopulation(int pop) {
        population = pop;
    }

    /**
     * Set the colony's population growth to a new number
     * @param g	new growth of colony
     */
    public void setGrowth(double g) {
        growth = g;
    }

    /**
     * Sets the colony's name to a new name
     * @param n	name to be changed to
     */
    public void setName (String n) {
        name = n;
    }

    /**
     * Returns the colony's population
     * @return	colony's population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Returns the growth of the colony
     * @return	growth of the colony
     */
    public double getGrowth() {
        return growth;
    }

    /**
     * Return's name of the colony
     * @return	colony's name
     */
    public String getName() {
        return name;
    }

    /**
     * Colony has a party where the population grows as a result
     */
    public void party() {

        population *= (growth);
    }

    /**
     * Prints a descriptive statement of the colony
     */
    @Override
    public String toString() {
        return this.name + " " + this.population;
    }


}
