package bessegatto.com.br.interfaces;

public interface OnlinePayment {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
