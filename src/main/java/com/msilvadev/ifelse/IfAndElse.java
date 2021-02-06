package com.msilvadev.ifelse;

public class IfAndElse {

    public static void main(String args[]) {
        boolean authentic = true;

        if(authentic){ // This expression always need return a boolean
            System.out.println("OK!");
        }else {
            System.out.println("Not OK!");
        }

        boolean value = false;
        if(value = true){ // Pay attention, I used =, so is an attribution
            System.out.println("It's true");
        }
    }
}
