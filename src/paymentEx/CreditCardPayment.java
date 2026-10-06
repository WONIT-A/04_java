package paymentEx;

public class CreditCardPayment extends Payment implements Refundable{

    CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void processPayment() {
        System.out.println("신용카드로 결제합니다.");
    }

    @Override
    public void refund() {  // refund는 interface Refundable에서
        // private 변수인 amount의 getter로 금액을 '확인'만 할 수 있습니다.
        System.out.println(this.displayAmount() + "원 환불을 진행합니다"); // displayAmount()는 Payment 부모클래스에서 가져와서 둘 다 쓸 수 있음
    }
}
