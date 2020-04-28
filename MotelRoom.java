public abstract class MotelRoom {
    protected String description;

    public String getDescription() { return description; }

    public void checkIn() { System.out.println(" Checked in to: " + description); }

    public abstract double cost();

}
