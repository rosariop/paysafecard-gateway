package de.polito.payment;

import de.polito.payment.dto.InitDTO;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Base64;

@RegisterRestClient(baseUri = "https://private-anon-c55d8a06ba-paysafecardapien.apiary-proxy.com/v1")
@ClientHeaderParam(name = "Authorization", value = "{lookupAuth}")
public interface PSPaymentService {

    // TODO: Paste or Inject token
    String API_TOKEN = "token";

    default String lookupAuth() {
        return "Basic " +
                Base64.getEncoder().encodeToString(API_TOKEN.getBytes());
    }

    @POST
    @Path("/payments")
    Response initPayment(InitDTO initDTO);

}
