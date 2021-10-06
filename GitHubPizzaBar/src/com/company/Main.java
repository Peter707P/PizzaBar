package com.company;

public class Main {

    public static void main(String[] args) {


        BasicPizza basicPizza = new BasicPizza("Margarita","thin","tomato","cheddar",4.5);
        basicPizza.addPizzaAddition1("onion",0.75);
        basicPizza.addPizzaAddition2("corn",1.25);
        System.out.println("Grand total " + basicPizza.itemizePizza());
        PizzaExtra pizzaExtra = new PizzaExtra("cream","mozzarella",5.5);
        pizzaExtra.addExtra1("bacon",1.45);
        pizzaExtra.addExtra2("onion",0.5);
        System.out.println("Grand total " + pizzaExtra.itemizePizza());

        PizzaMenu pizzaMenu = new PizzaMenu();
        pizzaMenu.addPizzaAddition1("corn",2.5);
        System.out.println("Total for menu " + pizzaMenu.itemizePizza());



    }
}
