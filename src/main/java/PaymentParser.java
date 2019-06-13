import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Gustavo de Jesus Gomes on 13/06/2019.
 */
public class PaymentParser implements JsonDeserializer<PaymentOrders> {
    @Override
    public PaymentOrders deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        PaymentOrders result = new PaymentOrders();


        try {
            final HashMap<String, CodePayment> map = readServiceUrlMap(json.getAsJsonObject());

            if(map != null) {
                result.setCodePayments(map);
            }

        }catch (JsonSyntaxException ex){
            return null;
        }

        return result;

    }

    private HashMap<String, CodePayment> readServiceUrlMap(final JsonObject jsonObject) throws JsonSyntaxException {

        if(jsonObject == null) {
            return null;
        }
        Gson gson = new Gson();

        HashMap<String, CodePayment> products = new HashMap<>();

        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {

            String key = entry.getKey();
            CodePayment value = gson.fromJson(entry.getValue(), CodePayment.class);
            products.put(key, value);
        }
        return products;
    }

}
