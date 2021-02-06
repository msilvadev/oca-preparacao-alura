package com.msilvadev.arrays;

public class TestArrays {

    public static void main(String[] args) {
        // Declare
        int[] ages;

        long []numbers;

        long[]lengths;

        // Initialize -> when we initialize an array Java put the default in each item of array
        ages = new int[10]; // We need to declare the capacity of array in your initialization
        System.out.println(ages[0]);

        ages = new int[]{0,1,2,3,4,5,6,7};
        System.out.println(ages[3]);

        double pesos[] = {2.2d, 1.2D};
        System.out.println(pesos[1]);

        System.out.println(pesos[pesos.length-1]);

        /**
         * Will compile but will throw runtime exception: java.lang.NegativeArraySizeException
         */
        //int[] negativeSizetest = new int[-1];

        int[] toFor = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("-------------------------------------");
        System.out.println("for ");

        for(int i = 0; i < toFor.length; i++){
            System.out.print(toFor[i] + ", ");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("for each");

        /**
         * From Java 1.5 was introduced for each
         * We haven't index of array in this implementation
         */
        for(int item : toFor){
            System.out.print(item + ", ");
        }

        System.out.println();
    }
}
