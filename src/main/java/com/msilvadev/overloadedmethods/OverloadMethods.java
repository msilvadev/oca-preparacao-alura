package com.msilvadev.overloadedmethods;

public class OverloadMethods {

    public static void main(String[] args) {
        new Overloader().method();
        new Overloader().method(123);
        new Overloader().method(123.4);

        // Java will call the most specific method. This case, the method which receive String as a param
        new Overloader().method2("string");
    }
}

/**
 * Method overload is just when a method has the same: name, return type, access modifier,
 * AND QUANTITY DIFERENTS OF ARGUMENTS OR DIFERENT TYPE OF ARGUMENTS
 */
class Overloader{
    public void method(){
        System.out.println("without args");
    }
    public void method(int i){
        System.out.println("with int");
    }
    public void method(double i){
        System.out.println("with double");
    }

    public void method2(String s){
        System.out.println("with string");
    }
    public void method2(Object o){
        System.out.println("with object");
    }
}
