package com.example.cryptoapp;
// model class to hold the objects
public class CurrencyRVModal {
    //declared variables
    private String name;
    private String symbol;
    private double price;


    //constructors
    public CurrencyRVModal(String name, String symbol, double price) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

//getters and setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
