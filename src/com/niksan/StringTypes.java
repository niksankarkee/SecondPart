package com.niksan;

public class StringTypes {
    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString);
        System.out.println("myString is equls to " + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);
        int myInt = 10;
        String lastStr = "20";
        lastStr = myInt + lastStr;
        System.out.println("lastStr is equal to " + lastStr);
    }
}
