package com.Composition;

public class Room {

    private Couch theCouch;
    private TV theTV;
    private Chair theChair;

    public Room(Couch theCouch, TV theTV, Chair theChair) {
        this.theCouch = theCouch;
        this.theTV = theTV;
        this.theChair = theChair;
    }

    public void turnOnTV () {
        theTV.powerButton();
    }

    public void recline() {
        theChair.recline();
    }

    public void foldOutCouch() {
        theCouch.foldOutCouch();
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public TV getTheTV() {
        return theTV;
    }

    public Chair getTheChair() {
        return theChair;
    }
}
