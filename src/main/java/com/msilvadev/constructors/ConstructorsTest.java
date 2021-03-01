package com.msilvadev.constructors;

public class ConstructorsTest {

    public static void main(String... args){
        A a0 = new A("s");


        // Not works. Because default constructor not exist
        //A a1 = new A();
    }
}

class A{

    int i = 11;

    /**
     * default constructor
     *
     * Constructos has exactly Class name
     *
     * If my class was public, the default constructor also is public
     */
//    A(){
//        super(); // Call Object() constructor
//    }

    /**
     * In the moment that I add my constructor, Java compiler not add default constructor
     * @param s
     */
    A(String s){

        /**
         * works because Java initialize member variable first, after call constructors
         */
        System.out.println(i);
    }
}