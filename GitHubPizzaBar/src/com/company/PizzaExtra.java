package com.company;

public class PizzaExtra extends BasicPizza {

    public PizzaExtra(  String sauce, String cheese, double price) {
        super("Exxxtra Pizza", "thick", sauce, cheese, price);
    }
    private String extraAddition1Name;
    private double extraAddition1Price;
    private String extraAddition2Name;
    private double extraAddition2Price;

    public void addExtra1(String name,double price){
        this.extraAddition1Name =name;
        this.extraAddition1Price = price;
        System.out.println("For your Pizza Exxxtra You added " + extraAddition1Name + " for the price of " + extraAddition1Price);

    }
    public void addExtra2(String name,double price){
        this.extraAddition2Name =name;
        this.extraAddition2Price = price;
        System.out.println("For your Pizza Exxxtra You added " + extraAddition2Name + " for the price of " + extraAddition2Price);

    }

    @Override
    public double itemizePizza() {
        return super.itemizePizza() + extraAddition1Price + extraAddition2Price;
    }
}
