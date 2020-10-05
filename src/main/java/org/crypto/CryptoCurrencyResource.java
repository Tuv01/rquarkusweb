package org.crypto;

import org.crypto.data.Currency;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.concurrent.CompletionStage;

import org.crypto.data.MultipartBody;
import org.crypto.service.CurrencyService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

// Rest Client to use the following api:
// https://api.coinlore.net/api/ticker/?id=90
@Path("/crypto")
public class CryptoCurrencyResource {

    @Inject
    @RestClient
    private CurrencyService echoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CompletionStage<Collection<Currency>> getCrypto (@QueryParam("id") String id) {
        return echoService.getCurrency(id);
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String echoFile(String body) {
        return body;
    }

    @Path("test")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String callEcho() {
        final MultipartBody multipartBody = new MultipartBody();
        multipartBody.file = new ByteArrayInputStream("Hello world".getBytes());
        multipartBody.name = "hello.txt";
        return echoService.sendFile(multipartBody);
    }

}