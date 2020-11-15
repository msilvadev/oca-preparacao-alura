package com.msilvadev.operators;

public class Arithmetic {
    public static void main(String args[]) {
        int two=2, ten=10;

        int add = two + ten;
        int sub = two - ten;
        int multi = two * ten;
        int divide = two / ten;

        int remainder = two % ten;
        System.out.println("Remainder of division: " + remainder);

        /**
         * Arithmetic operation always return higher type. In this case double
         */
        double d = 0 + 2.00;
        System.out.println("int plus double return double -> 0 + 2.00 = " + d);


        //int divideByZero = 5 / 0; // Execution error, ArithmeticException -> dividison by zero not exists
        double divideByZeroFloatingPoint = 5 / 0.0; // Works fine, will return Infinity
        System.out.println(divideByZeroFloatingPoint);

        /**
         * Works because first operation(two + 0.0) return a double number
         * Then, double divide by 0 its ok
         */
        System.out.println((two + 0.0) / 0);

        double positiveInfinity = 5.0 / 0;
        double negativeInfinity = -5.0 / 0;
        System.out.println(positiveInfinity + negativeInfinity); // Return Nan which means -> Not a number

        short s = 1;
        short s1 = 2;
        short r = (short) (s + s1); // Works, but can loss precision
        System.out.println(r);
    }
}
