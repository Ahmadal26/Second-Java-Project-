import java.util.Date;

public class Payment {
    private Date paymentDate;
    private double amount;
    private String paymentMethod;

    public Payment(double amount, String paymentMethod) {
        this.paymentDate = new Date();
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment History: \nPayment Date = " + paymentDate + "\nAmount= " + amount + "\nPayment Method = "
                + paymentMethod;
    }

}
