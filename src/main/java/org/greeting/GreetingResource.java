package org.greeting;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//JAX-RS EndPoint 
@Path("/hello")
public class GreetingResource {


    @Inject 
    private GreetingService greetingService;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return greetingService.greeting();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String hello(@QueryParam("name") String name) {
        return greetingService.greeting(name);
    }

}