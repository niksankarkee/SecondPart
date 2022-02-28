package com.niksan;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // write your code here
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value : " + myMinIntValue );
        System.out.println("Integer Maximum value : " + myMaxIntValue );

//        int decimalIntTest = 10.50;

//        int tempVal = 21474836475;
//        System.out.println(tempVal);

        System.out.println("Busted Max value : " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted Min value : " + (myMinIntValue - 1)); // underflow

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum value " + myMinByteValue);
        System.out.println("Byte Maximum value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum value " + myMinShortValue);
        System.out.println("Short Maximum value " + myMaxShortValue);

        long myLongValue = 100L;
        System.out.println(myLongValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum value " + myMinLongValue);
        System.out.println("Long Maximum value " + myMaxLongValue);

//        CASTING
        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        int aVal = 100;
        byte bVal = (byte) aVal;

        short myNewShortValue = (short)(myMinShortValue / 2);

//        Premitive Typtes Challanges
//        Your challenge is to create a byte variable and set it to any valid byte number,
//        it doesn't matter.
//        Create a short variable and set it to any valid short number

//        Create an int variable and set it to any valid int number.
//        Lastly, create a variable of type
//        long and make it equal to 50000 plus 10 tymes the sum of the byte plus the short plus the integer values.

        // Solution
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short)(1000 + 10 * (byteValue + shortValue + intValue));

    }
}
