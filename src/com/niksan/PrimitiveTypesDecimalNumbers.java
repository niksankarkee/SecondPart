package com.niksan;

public class PrimitiveTypesDecimalNumbers {
    public static void main(String[] args) {
        // write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
      //  float myFloatValue = 5.25; // Error
        float myFloatValue = 5.25f; // Error
        double myDoubleValue = 5.25d;

        // Challenge
        // Thinking back to our discussion on casting which we used to convert both
        // a byte and a short to the int equivalent, how do you think you would do
        // the same for the float to remove the error? => float myFloatValue = 5.25; // Error

        float myFloatValueChallange =(float) 5.25;

        int val = 5 / 3;
        System.out.println(val);

        // Challenge
        // Convert a given number of pounds to kilograms.
        // STEPS:-
        // 1) Create a variable with the appropriate type to store the number of pounds to be converted to kg
        // 2) Calculate the result i.e the number of kg based on the contents of the
        //      variable above and store the result in a 2nd appropriate variable

        // 3) Print out the result.

        // HINT:-
        // 1 pound is equal 0.45359237 of a kg. This should help you perform the calculation.

        // SOLUTION
        double numberOfPounds = 200d;
        double convertedKg = numberOfPounds * 0.45359237d; // d is optional
        System.out.println("Converted kilograms= "+ convertedKg);

        // ---------------------
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);



    }
}
