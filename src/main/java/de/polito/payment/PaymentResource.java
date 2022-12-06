package de.polito.payment;

import de.polito.payment.dto.CustomerDTO;
import de.polito.payment.dto.InitDTO;
import de.polito.payment.dto.RedirectDTO;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/payment")
public class PaymentResource {

    @Inject
    @RestClient
    PSPaymentService psPaymentService;

    @GET
    @Path("/{rankUuid}")
    @Produces(MediaType.TEXT_HTML)
    public Response payRank(@PathParam("rankUuid") String rankId){
        RedirectDTO redirectDTO = new RedirectDTO("https://google.com", "https://youtube.com");
        CustomerDTO customerDTO = new CustomerDTO("1");
        InitDTO initDTO = new InitDTO(99.99, redirectDTO, customerDTO, "https://gidf.com");

        psPaymentService.initPayment(initDTO);

        return Response.ok().build();
    }
}
