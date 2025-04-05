package bessegatto.com.br.service;

import bessegatto.com.br.entities.Contract;
import bessegatto.com.br.entities.Installment;
import bessegatto.com.br.interfaces.OnlinePayment;

import java.time.LocalDate;
import java.util.Locale;

public class ContractService {
    private OnlinePayment onlinePayment;

    public ContractService(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void processContract(Contract contract, int months){
        double basicInstallment = contract.getTotalValue() / months;
        for(int i = 1;i <= months;i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest =   onlinePayment.interest(basicInstallment,i);
            double fee = onlinePayment.paymentFee(basicInstallment + interest);
            double quota = basicInstallment + interest + fee;

            contract.getInstallmentList().add(new Installment(dueDate,quota));
        }
    }
}
