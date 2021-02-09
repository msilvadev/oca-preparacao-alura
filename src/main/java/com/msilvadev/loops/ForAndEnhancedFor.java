package com.msilvadev.loops;

import java.util.ArrayList;

/**
 * For default
 * For Enhanced (for each)
 */
public class ForAndEnhancedFor {

    public static void main(String args[]) {

        /**
         * for(Declare variable; boolean expression; increment){}
         * Increment is the final step
         *
         * Three parts of FOR declaration is optional
         * for( ; ; ) -> is valid. Is a infinite loop
         */
        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }

        int numbers[] = new int[]{1,2,3,4,5,6,7,8,9};
        for(int number: numbers){
            System.out.println(number);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Matheus");
        list.add("Dev");
        /**
         * Java use Iterator under the hood to iterate
         * Java will iterate all items of array
         */
        for(String item : list){
            System.out.println(item);
        }
    }
}
