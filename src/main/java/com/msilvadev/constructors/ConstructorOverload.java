package com.msilvadev.constructors;

public class ConstructorOverload {

    public static void main(String... args){
        Book book = new Book(9);
        int[] i = new int[0];
        System.out.println(i.length);

        myMethod(0, new Object()); // will not compile
    }

    public void myMethod(int m, Object p, double d){
    }
}

class Book {

    Book(){
        System.out.println("construtor without args..");
    }

    Book(int i){
        this(); // Call constructor without args
        System.out.println("constructor with int arg");
    }
}

abstract class Test {
    abstract public void add() throws Exception;
}
