import com.google.gson.annotations.JsonAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gustavo de Jesus Gomes on 13/06/2019.
 */

public class PaymentOrders {
    private Map<String, CodePayment> codePayments = new HashMap<>();

    public Map<String, CodePayment> getCodePayments() {
        return codePayments;
    }

    public void setCodePayments(Map<String, CodePayment> codePayments) {
        this.codePayments = codePayments;
    }
}
