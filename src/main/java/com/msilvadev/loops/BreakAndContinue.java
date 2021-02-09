package com.msilvadev.loops;

public class BreakAndContinue {

    public static void main(String []args){
        int i = 0;

        while(i < 10){
            i++;
            System.out.println(i);
            if(i == 5) break; // Java will go out from while loop
        }

        System.out.println("-------------CONTINUE---------------");
        i = 0;
        while(i < 10){
            i++;
            if(i == 5) continue; // Java will go to other iteration
            System.out.println(i);
        }

        System.out.println("-------------LOOP NAMED---------------");
        /**
         * All loops can have a name.
         */
        extern: for(int j = 0; j < 10; j++){
            for(int k = 0; k < 10; k++){
                if(j * k == 25) break extern;
                System.out.println(j + " * " + k + " = " + (j * k));
            }
        }

        System.out.println("Finished!");
    }
}
