package com.msilvadev.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Arrays we need define length it in the initialization
 *
 * Java provides to us ArrayList, which has an array internally, that when we use
 * all position the Java will do redimension to us
 */
public class TestArrayList {

    public static void main(String... args){
        String[] array = new String[10];

        List<String> myArrayList = new ArrayList<String>(); // Empty list
        myArrayList.add("Java"); // add new item
        myArrayList.add("Typescript");

        boolean contain = myArrayList.contains("Java"); //Check if exit "Java" in my array
        System.out.println(contain);

        boolean wasRemoved = myArrayList.remove("Typescript"); // To remove the first occorrence
        System.out.println("Was removed: " + wasRemoved);

        System.out.println(myArrayList.size()); // How much items exist in my array

        // To get an array of my ArrayList We can use toArray(), but Java will convert to array of Objects
        Object[] arrayListToObjectArray = myArrayList.toArray();

        String[] arrayListToStringArray = myArrayList.toArray(new String[myArrayList.size()]);

        myArrayList.set(0, "C"); // Change first element to C;

        myArrayList.forEach(System.out::println);

        myArrayList.add("index");
        myArrayList.add("index");
        // indexOf first occorrence. -1 will be returned if not exist
        int index = myArrayList.indexOf("index");
        System.out.println(index);
        int lastIndex = myArrayList.lastIndexOf("index"); // Index of last occorrence
        System.out.println(lastIndex);

        System.out.println();
        System.out.println("--------ITERATOR--------");

        // Iterator is a object that knows how to iterate in our array
        Iterator<String> iterator = myArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
