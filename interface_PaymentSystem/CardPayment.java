package interface_PaymentSystem;

public class CardPayment implements Payment {

    public CardPayment() {
        super();
    }

    public void pay(double amount) {
        System.out.println("Payment Method: Card");
        System.out.println("Payment Amount: " + amount);
    }
}
