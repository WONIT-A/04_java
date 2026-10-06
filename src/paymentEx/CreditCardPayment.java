package paymentEx;

public class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println("신용카드로 결제합니다.");
    }
}
