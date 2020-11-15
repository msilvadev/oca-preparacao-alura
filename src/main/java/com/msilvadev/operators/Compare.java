package com.msilvadev.operators;

public class Compare {
    public static void main(String... args){
        // Operator of comparation
        System.out.println(1 == 1);
        System.out.println(1 != 1);
        System.out.println(2 >= 1);
        System.out.println(2 <= 1);
        System.out.println(2 > 1);
        System.out.println(2 < 1);

        System.out.println(1 == 1.0); // true
        System.out.println(1 == 1.10); // false
    }
}
