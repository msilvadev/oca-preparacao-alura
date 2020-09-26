package com.msilvadev.methods;

import java.util.Arrays;

class Calculator{
    /**
     * will be able received zero or infinite numbers.
     * Var args will be able is an array with none elements.
     * @param numbers
     * @return
     */
    public int add(int... numbers){ //Var args needs be the last argument
        System.out.println(numbers.length);
        return Arrays.stream(numbers).sum();
    }
}

public class TestCalculator {

    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println(calc.add(1,2,3,4,5,6));
        System.out.println(calc.add(5,6));
        System.out.println(calc.add());
    }
}
