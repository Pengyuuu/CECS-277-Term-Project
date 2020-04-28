public class MasterRoach implements PaymentStrategy {

    private String name;
    private String cardNum;
    private String cvv;
    private String dateOfExpiry;

    public MasterRoach(String n, String c, String cv, String d) {
        name = n;
        cardNum = c;
        cvv = cv;
        dateOfExpiry = d;
    }

    public void pay(int n) {
        System.out.println("Paid with CreditCard");

    }

    @Override
    public String toString() {
        return "MasterRoach card details: " + name;
    }


}
