package com.stackorout.domain;

public class ImplementMethods {
    public void fillUpToner(int tonerlevel)
    {
        if(tonerlevel<100) {
            tonerlevel = 100;
            System.out.println("the  toner level is increased to:"+tonerlevel);
        }
        else
            System.out.println("The toner level is already 100%");
    }
    public void printPages(int pages ,boolean duplex)
    {
        if(duplex==true)
        {
            System.out.println("The number of pages printed is: "+pages/2);
        }
        else
            System.out.println("Number of pages printed is : "+pages );
    }
}
