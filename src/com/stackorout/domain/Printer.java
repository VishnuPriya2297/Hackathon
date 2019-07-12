package com.stackorout.domain;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer() {
      //  this.tonerLevel =34;
        //this.duplexPrinter=true;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
       // return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }


}
