package interface_PaymentSystem;

public class UPIPayment implements Payment {

    public UPIPayment() {
        super();
    }

    public void pay(double amount) {
        System.out.println("Payment Method: UPI");
        System.out.println("Payment Amount: " + amount);
    }
}