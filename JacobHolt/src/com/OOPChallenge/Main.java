package com.OOPChallenge;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.25);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.10);
        System.out.println("Total burger price is " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizehamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("should not do this", 50.00);
        db.itemizehamburger();
    }
}
