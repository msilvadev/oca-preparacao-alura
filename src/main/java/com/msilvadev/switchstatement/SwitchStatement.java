package com.msilvadev.switchstatement;

public class SwitchStatement {

    public static void main (String... args) {
        int i = 1;
        final int finalVariable = 4;
        /**
         * Switch with float and double is not possible.
         * We can use any integer number, less than or equal to int or String.
         * Enum also works, but is not required to Oracle Certified Associate Java Programmer 8
         */
        switch(i) {
            case 1:
                System.out.println("First option");
                break; // If we not use break statement Java will execute all others println
            case 2:
                System.out.println("Second option");
                break;
            case 3:
                System.out.println("Third option");
                break;
            case finalVariable: // If variable it is not final
                System.out.println("Fourth option");
                break;
            default: // Evaluate if any other case is true.
                System.out.println("Default");
        }
    }
}
