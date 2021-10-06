package com.company;

public class BasicPizza {

    private String name;
    private String crust;
    private String sauce;
    private String cheese;
    private double price;

    public BasicPizza(String name, String crust, String sauce, String cheese, double price) {
        this.name = name;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.price = price;
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addPizzaAddition1(String name,double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addPizzaAddition2(String name,double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addPizzaAddition3(String name,double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addPizzaAddition4(String name,double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public double itemizePizza(){
        double basePizzaPrice = price;
        System.out.println("Your order is a " + this.name + " on a " + this.crust + " crust with " + this.sauce
                          + " sauce and " + this.cheese + " cheese for the price of " + this.price);
        if (this.addition1Name != null){
            System.out.println("Addition " + this.addition1Name + " added for the price of " + this.addition1Price);
            basePizzaPrice+=addition1Price;
        }
        if (this.addition2Name != null){
            System.out.println("Addition " + this.addition2Name + " added for the price of " + this.addition2Price);
            basePizzaPrice+=addition2Price;
        }
        if (this.addition3Name != null){
            System.out.println("Addition " + this.addition3Name + " added for the price of " + this.addition3Price);
            basePizzaPrice+=addition3Price;
        }
        if (this.addition4Name != null){
            System.out.println("Addition " + this.addition4Name + " added for the price of " + this.addition4Price);
            basePizzaPrice+=addition4Price;
        }
        return basePizzaPrice;
    }

}
