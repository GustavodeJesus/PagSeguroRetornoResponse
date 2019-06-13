import java.util.List;

/**
 * @author Gustavo de Jesus Gomes on 13/06/2019.
 */
public class CodePayment {
    private String code;
    private int status;
    private int amount;
    private int grossAmount;
    private String lastEventDate;
    private String schedulingDate;
    private List<Transaction> transactions;
    private Discount discount;

    public String getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }

    public int getGrossAmount() {
        return grossAmount;
    }

    public String getLastEventDate() {
        return lastEventDate;
    }

    public String getSchedulingDate() {
        return schedulingDate;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Discount getDiscount() {
        return discount;
    }
}
