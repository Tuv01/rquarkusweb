package org.crypto.data;

import javax.json.bind.annotation.JsonbProperty;

public class Currency {
    private String id;
    private String symbol;
    private String name;
    @JsonbProperty("price_usd")
    private String priceUsd;
    @JsonbProperty("price_btc")
    private String priceBtc;

    public Currency() {
    }
    
    public Currency(String symbol , String name, String priceUsd, String priceBtc) {
        this.symbol = symbol;
        this.name = name;
        this.priceUsd = priceUsd;
        this.priceBtc = priceBtc;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
    }

    public String getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(String priceBtc) {
        this.priceBtc = priceBtc;
    }

} 