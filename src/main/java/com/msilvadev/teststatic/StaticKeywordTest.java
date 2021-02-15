package com.msilvadev.teststatic;

public class StaticKeywordTest {

    public static void main(String args[]){

    }
}

class Moto{

    public String brand;

    /**
     * Scope of static variables and methods is the Class and not each instance.
     * Static things can access just static things
     */
    private static int totalMotos = 0;
    private int getTotalMotos(){
        return totalMotos;
    }
}