package org.books;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

import org.data.Book;



@Path("/book")
public class BookResource {

    private static ArrayList <Book> books = new ArrayList<>();

    static {
        books.add(new Book("The Freelancer's Bible: Everything You Need to Know to Have the Career of Your Dreams","Sara Horowitz"));
        books.add(new Book("building-an-api-backend-with-microprofile","Hayri Cicek"));
        books.add(new Book("Microservices best practices","IBM"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> getBooks(){
        return books;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Book addBook (Book book){
        books.add(book);
        return book;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Book updateBook(@PathParam("id") Integer index, Book book){
        books.remove((int) index);
        books.add(index,book);
        return book;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Book deleteBook(@PathParam("id") Integer index){
        return books.remove((int)index);
    }

}