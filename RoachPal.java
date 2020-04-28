public class RoachPal implements PaymentStrategy {

    private String email;
    private String pw;


    public RoachPal(String e, String p) {
        email = e;
        pw = p;
    }

    public void pay(int n) {
        System.out.println("Paid with Paypal");

    }

    @Override
    public String toString() {
        return "Paypal email details: " + email;
    }
}
