package com.msilvadev.datatypes;

class Motor {
}

class Car {
    int year; // Default value is 0 to all numeric variables
    char firstLetter; // For Java char is a numeric type, so your default value is 0
    boolean used; // Default value is false to boolean type
    Motor motor; // Default value to a reference is null
    String brand; // Default value to a reference is null
}

public class Teste {

    public static void main(String[] args) {
        /* Each position in this array contain your default value.
         * In this case as is an array of int your default value is 0(zero)
         */
        int[] valueArray = new int[10];
        System.out.println(valueArray[0]);

        /* If we pass a literal integer number with zero in the front, Java will consider which this number on octal base
         * Literal number 08 is not accepted in int variable.
         */
        int intOcta = 010;
        System.out.println(intOcta); // So, here in console will print value 8, which is  represented with number 10 on octal base

        /* If we pass a literal integer number with 0x..., Java will consider which this number on hexadecimal base.
         * So, it will accepted just 0-9 A-F
         * The x, can be x or X
         */
        int intHex = 0xF;
        System.out.println(intHex); // So, here in console will print value 15, which  is represented with letter F on hexadecimal base

        // If we pass a literal integer number with 0b..., Java will consider which this number on binary base.
        int intBinary = 0b1;
        System.out.println(intBinary); // So, here in console will print value 1, which  is represented with number 1 on binary base

        Car car = new Car();
        System.out.println(car.year);
        System.out.println(car.firstLetter);
        System.out.println(car.used);
        System.out.println(car.motor);
        System.out.println(car.brand);
    }
}
