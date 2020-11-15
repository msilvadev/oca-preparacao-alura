package com.msilvadev.operators;

public class Logical {
    public static void main(String args[]) {
        System.out.println(1 == 1 & 1 > 2); // false 1 is equal to 1 but 1 is not bigger than 2
        System.out.println(1 == 1 | 1 > 2); // qualquer um verdadeiro true se não false
        System.out.println(1 == 1 ^ 1 > 2); // EXCLUSIVE OR somente um dos dois pode ser verdade para ser true
        System.out.println(!(1 == 1)); // false, because not true result in false

        System.out.println("---------------------------------------------");

        // Not call the method because first comparation is false, and false AND any other result is false.
        // And when we use short circut Java not execute rigth side if the condition will be false.
        System.out.println(1 != 1 && methodTest("first"));
        System.out.println(1 != 1 || methodTest("second -> "));
    }

    private static boolean methodTest(String text) {
        System.out.print(text);
        return true;
    }
}
