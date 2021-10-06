package com.company;

public class PizzaMenu extends BasicPizza{

    public PizzaMenu() {
        super("Pizza of the day", "Always Thin", "Napolitana ", "mixed ", 14.5);
        super.addPizzaAddition1("Coke",0.0);
        super.addPizzaAddition2("Cookie",0.0);
    }

    @Override
    public void addPizzaAddition1(String name, double price) {
        System.out.println("No addition possible for this menu");
    }

    @Override
    public void addPizzaAddition2(String name, double price) {
        System.out.println("No addition possible for this menu");
    }

    @Override
    public void addPizzaAddition3(String name, double price) {
        System.out.println("No addition possible for this menu");
    }

    @Override
    public void addPizzaAddition4(String name, double price) {
        System.out.println("No addition possible for this menu");
    }

    @Override
    public double itemizePizza() {
        return super.itemizePizza();
    }
}
