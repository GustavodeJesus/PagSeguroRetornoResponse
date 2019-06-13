import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.PrintStream;
import java.util.logging.Logger;


/**
 * @author Gustavo de Jesus Gomes on 13/06/2019.
 */
public class Home {


    public static void main(String[] args) {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(PaymentOrders.class, new PaymentParser());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ws.sandbox.pagseguro.uol.com.br/")
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .build();

        PagSeguroInterface service = retrofit.create(PagSeguroInterface.class);

        Call<Payment> payments = service.getPayments("Coloca o E-mail aqui ","Coloca o Token aqui");

        payments.enqueue(new Callback<Payment>() {
            @Override
            public void onResponse(Call<Payment> call, Response<Payment> response) {
                Logger.getLogger(String.valueOf(response.isSuccessful()));

                print(System.out, new GsonBuilder().setPrettyPrinting().create().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<Payment> call, Throwable t) {
                Logger.getLogger(t.getMessage());
                t.printStackTrace();

            }
        });


    }

    public static void print(PrintStream out, Object message) {
        out.println(message);
    }


}
