package org.stockyahoo;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Endpoint for stock data.
 * Start Angular using
 * ng serve --proxy-config proxy.conf.json
 */
@Path("/stocks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StockResource {

  /**
   * Retrieve latest stock price (from Yahoo Finance).
   * @param symbol Stock symbol e.g: Gold,BTC-EUR .
   * @return Response with StockLatestPriceResponse.
   * @throws IOException Failed to retrieve price.
   */
  @Path("/{symbol}/latestPrice")
  @GET
  public Response stock(@PathParam("symbol") String symbol) throws IOException {
    Stock stock = YahooFinance.get(symbol);

    Response response = null;
    if (stock == null) {
      response = Response.status(Response.Status.NOT_FOUND).build();
    } else {
      StockLatestPriceResponse stockResponse = new StockLatestPriceResponse(stock.getSymbol(), stock.getQuote().getPrice());
      response = Response.ok(stockResponse).build();
    }
    return response;
  }
}