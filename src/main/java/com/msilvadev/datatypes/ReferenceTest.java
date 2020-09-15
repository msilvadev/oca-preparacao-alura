package com.msilvadev.datatypes;

public class ReferenceTest {

    public static void main(String... args){
        //By value
        int a = 10;
        int b = a; // Here Java will get the value of variable 'a' and will copy and to assign in variable 'b'

        a += 5; // Here just variable a will have 15 value

        System.out.println(a);
        System.out.println(b);

        //By reference
        MyObject object0 = new MyObject(); // Here I created new object in memory
        MyObject object1 = object0; // Here I pass the reference to object created in previous line

        object1.myObjectInt += 5;

        // Both will print 15, because object1 is a reference to object0
        System.out.println(object0.myObjectInt);
        System.out.println(object1.myObjectInt);
    }
}

class MyObject{
    public int myObjectInt = 10;
}
