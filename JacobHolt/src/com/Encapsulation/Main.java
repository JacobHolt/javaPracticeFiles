package com.Encapsulation;

public class Main {
    public static void main(String[] args){

       /* Player player = new Player();

        player.fullName = "Levi";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.losehealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.losehealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());*/

      // EnhancedPlayer player = new EnhancedPlayer("Levi", 200, "Sword");
       // System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(100, 0, false);

        System.out.println("\n\nToner level is at " + printer.getTonerLevel());
        System.out.println("Pages printed " + printer.getPagesPrinted());

        printer.Print();

        System.out.println("Toner level is at " + printer.getTonerLevel());
        System.out.println("Pages printed " + printer.getPagesPrinted());

        Printer printer2 = new Printer(75, 0, true);

        System.out.println("\n\nToner level is at " + printer2.getTonerLevel());
        System.out.println("Pages printed " + printer2.getPagesPrinted());

        printer2.Print();

        System.out.println("Toner level is at " + printer2.getTonerLevel());
        System.out.println("Pages printed " + printer2.getPagesPrinted());

    }
}
