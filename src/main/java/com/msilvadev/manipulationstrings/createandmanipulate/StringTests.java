package com.msilvadev.manipulationstrings.createandmanipulate;

public class StringTests {

    public static void main(String... args) {
        String directName = "Java";
        String indirectName = new String("Java");
        char[] name = new char[]{'J','a','v','a',};
        String name1 = new String(name);

        // Strings are immutable after string was created it never change
        String s = "caelum";
        s.toUpperCase(); // return a new Object in memory
        System.out.println(s); // Will print "caelum"
        // Strings uses char array from behind
        System.out.println(s.charAt(0)); // will print 'c'

        System.out.println("".isEmpty()); // true, because have not characters
        System.out.println("Java".isEmpty()); // false
        System.out.println("   ".isEmpty()); // false, because space is not empty

        // chaining methods, execute several methods in sequence
        String parser = "    I want Java Oficial Certified   ".toUpperCase().trim();
        System.out.println(parser);

        String java = "Java";
        System.out.println(java.substring(1)); // what position I am beginning, this case first 'A'
        System.out.println(java.substring(-1)); // StringIndexOutOfBoundsException

        System.out.println("Java".equals("java")); // false
        System.out.println("Java".equalsIgnoreCase("java")); //true
    }
}
