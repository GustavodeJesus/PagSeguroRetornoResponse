/**
 * @author Gustavo de Jesus Gomes on 13/06/2019.
 */
public class Payment {

    private String date;
    private int resultsInThisPage;
    private int currentPage;
    private int totalPages;
    private PaymentOrders paymentOrders;

    public String getDate() {
        return date;
    }

    public int getResultsInThisPage() {
        return resultsInThisPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public PaymentOrders getPaymentOrders() {
        return paymentOrders;
    }
}
