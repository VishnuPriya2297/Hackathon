package com.stackorout.domain;
import java.util.Scanner;

public class Print {


    public static void main(String[] args)
    {
        int pagesnumber;
        boolean dualprintr;
        int tonerlevel;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of pages you want to print");
        pagesnumber = sc.nextInt();
        System.out.println("enter if the printer can print on two sides of the paper ");
        dualprintr=sc.nextBoolean();
        Printer printer = new Printer();
        ImplementMethods implementmethods=new ImplementMethods();
        printer.setTonerLevel(67);
        printer.setNumberOfPagesPrinted(pagesnumber);
        printer.setDuplexPrinter(dualprintr);
       implementmethods.fillUpToner(printer.getTonerLevel());
       implementmethods.printPages(printer.getNumberOfPagesPrinted(),printer.isDuplexPrinter());
    }

}
