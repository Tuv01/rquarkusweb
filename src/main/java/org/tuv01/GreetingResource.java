package org.tuv01;

import org.rest.json.Fruit;

import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;


//JAX-RS EndPoint 
@Path("/hello")
public class GreetingResource {

    public static final String TOKEN= "dev";

    @Inject
    GreetingService service;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(@PathParam String name){
        return service.greeting(" " +name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/html")
    public String hello() {
        return "hello" + UUID.randomUUID().toString();
    }

    @GET
    @Path("/print/{name}")
    @Produces("application/json")
    public Fruit produceJSON( @PathParam("name") String name ) {
 
        Fruit fruit = new Fruit(name);
 
        return fruit;
    }
    
    @POST
    @Path("/send")
    @Consumes("application/json")
    public Response consumeJSON( Fruit fruit) {
 
        String output = fruit.toString();
 
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addHello(@HeaderParam("token")String hName,@QueryParam("token") String aName, String body){
        String token = hName != null ? hName: aName;
        if (!TOKEN.equals(token)){
            throw new RuntimeException("Unauthorized");
        }
        return "<b>Text<b>";
    }

}