package org.crypto.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.concurrent.CompletionStage;

import org.crypto.data.Currency;
import org.crypto.data.MultipartBody;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

@RegisterRestClient(configKey = "config.api.crypto")
@Path("echo")
public interface CurrencyService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    CompletionStage<Collection<Currency>> getCurrency(@QueryParam("id") String id);


    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    String sendFile(@MultipartForm MultipartBody body);

}