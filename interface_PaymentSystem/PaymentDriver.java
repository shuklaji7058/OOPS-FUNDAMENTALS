package interface_PaymentSystem;

public class PaymentDriver {

    public static void main(String[] args) {

        Payment p;

        p = new UPIPayment();
        p.pay(1500);

        System.out.println("----------------");

        p = new CardPayment();
        p.pay(2500);
    }
}
