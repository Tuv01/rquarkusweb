package org.stockyahoo;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.math.BigDecimal;

/**
 * @author Koert Zeilstra
 */
@RegisterForReflection
public class StockLatestPriceResponse {
  public String symbol;
  public BigDecimal latestPrice;

  public StockLatestPriceResponse() {
  }

  public StockLatestPriceResponse(String symbol, BigDecimal latestPrice) {
    this.symbol = symbol;
    this.latestPrice = latestPrice;
  }

}