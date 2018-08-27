package com.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "ASUS", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("z87", "ASUS", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Couch theCouch = new Couch("Ashley's", 5, "Leather");
        TV theTV = new TV("LG", 55, 1080);
        Chair theChair = new Chair("Lazyboy", "Leather", 5);

        Room theRoom = new Room(theCouch, theTV, theChair);
        theRoom.turnOnTV();
        theRoom.recline();
        theRoom.foldOutCouch();

        theRoom.getTheChair().getBrand();
        System.out.println(theRoom.getTheChair().getBrand());
    }

}
