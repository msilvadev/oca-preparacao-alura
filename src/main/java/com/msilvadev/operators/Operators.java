package com.msilvadev.operators;

public class Operators {

    public static void main(String[] args) {
        // -embracing -> +embracing Works fine
        // +embracing -> -embracing Not works fine

        // Attribution '='
        int i = 1;

        Person person = new Matheus();
        Person person1 = new Rocky();
        //Matheus msilva = new Person(); // Compilation error, because Person is abstract(+embracing)

        person.print();
        person1.print();
    }
}

interface Person{
    void print();
}

class Matheus implements Person{
    @Override
    public void print() {
        System.out.println("Matheus");
    }
}
class Rocky implements Person{
    @Override
    public void print() {
        System.out.println("Rocky");
    }
}