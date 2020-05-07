public class RoachPal implements PaymentStrategy {

    private String email;
    private String name;


    public RoachPal(String e, String p) {
        email = e;
        name = p;
    }

    public void pay(double n) {
        System.out.println("Paid with RoachPal");

    }

    @Override
    public String toString() {
        return "RoachPal email details: " + email;
    }
}
