package org.course;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

import io.netty.util.internal.StringUtil;

@Path("/book")
public class BookResource {

    private static List <String> books = new ArrayList<>();

    static {
        books.add("the freelancer's bible");
        books.add("building-an-api-backend-with-microprofile");
        books.add("Microservices best practices");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getBooks(){
       
        return StringUtil.join(",\n",books).toString();
    }

    @POST
    @Produces
    public String addBook (String book){
        books.add(book);
        return book;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String updateBook(@PathParam("id") Integer index, String book){
        books.remove((int) index);
        books.add(index, book);
        return book;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteBook(@PathParam("id") Integer index){
        return books.remove((int)index);
    }

}