package com.OOPChallenge;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.25);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.10);
        System.out.println("Total burger price is " + hamburger.itemizehamburger());
    }
}
