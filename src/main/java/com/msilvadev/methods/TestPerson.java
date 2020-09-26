package com.msilvadev.methods;

public class TestPerson {

    public static void main(String... args){
        Person person = new Person();

        person.setNome("Matheus");

        String nome = person.getNome();

        System.out.println(nome);
    }
}
