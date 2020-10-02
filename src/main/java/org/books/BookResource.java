package org.books;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.validation.Valid;
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
import org.service.BookService;

@Path("/book")
public class BookResource {

    private static ArrayList<Book> books = new ArrayList<>();

    static {
        books.add(new Book("The Freelancer's Bible: Everything You Need to Know to Have the Career of Your Dreams",
                "Sara Horowitz"));
        books.add(new Book("building-an-api-backend-with-microprofile", "Hayri Cicek"));
        books.add(new Book("Microservices best practices", "IBM"));
    }

    @Inject
    BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBooks() {
        return Response.status(202).entity(books).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addBook(@Valid Book book) {
       
        if (books.size() > 5) {
            return Response.status(400).entity("No more than 5 books are allowed").build();
        } else {
            books.add(book);
            return Response.ok(book).build();
        }

    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Book updateBook(@PathParam("id") Integer index, Book book) {
        books.remove((int) index);
        books.add(index, book);
        return book;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Book deleteBook(@PathParam("id") Integer index) {
        return books.remove((int) index);
    }

}