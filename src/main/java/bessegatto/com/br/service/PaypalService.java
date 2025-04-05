package bessegatto.com.br.service;

import bessegatto.com.br.interfaces.OnlinePayment;

public class PaypalService implements OnlinePayment {
    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * 0.01 * months;
    }
}
