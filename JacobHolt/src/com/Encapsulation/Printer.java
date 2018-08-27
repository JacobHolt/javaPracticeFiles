package com.Encapsulation;

public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        if (pagesPrinted == 0) {
            this.pagesPrinted = pagesPrinted;
        }
        this.isDuplex = isDuplex;
    }

    public void isPrinterDuplex(boolean trueOrFalse) {
        this.isDuplex = trueOrFalse;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void Print(){
        if (isDuplex == true) {
            pagesPrinted = pagesPrinted + 2;
            tonerLevel = tonerLevel - 30;
        }
        else {
            pagesPrinted = pagesPrinted + 1;
            tonerLevel = tonerLevel - 15;
        }
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
