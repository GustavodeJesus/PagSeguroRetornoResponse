import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * @author Gustavo de Jesus Gomes on 13/06/2019.
 */
public interface PagSeguroInterface {

    @Headers({
            "Accept: application/vnd.pagseguro.com.br.v3+json;charset=ISO-8859-1"
    })
    @GET("pre-approvals/1ACB73EE9595579DD4EE3F8C129D66EF/payment-orders")
    Call<Payment> getPayments(@Query("email") String email, @Query("token") String token);
}
