public class RoachPal implements PaymentStrategy {

    private String email;
    private String name;


    public RoachPal(String e, String p) {
        email = e;
        name = p;
    }

    public void pay(double n) {
        System.out.println(n + " Paid with RoachPal " + this.email);

    }

    @Override
    public String toString() {
        return " RoachPal email details: " + email;
    }
}
