package de.polito;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Set;


/*
* Do not touch examples until first real endpoint successfully running
* */
@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    MyRemoteService extensions;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<MyRemoteService.Extension> hello() {
        try{
            return extensions.getExtensions();
        }catch (Exception e){
            return Collections.emptySet();
        }
    }
}