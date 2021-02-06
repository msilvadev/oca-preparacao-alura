package com.msilvadev.arrayswithobjects;

public class ArrayWithObjects {

    public static void main(String[] args){
        // All positions with be initialize with null
        Client[] client = new Client[10];

        for(int i=0; i < client.length; i++){
            client[i] = new Client();
            client[i].name = "Cliene " + i;
        }

        for (Client clientItem : client) {
            System.out.println(clientItem.name);
        }

        // Runtime Excetion -> NullPointerException
        //System.out.println(client[0].name);
    }
}

class Client {
    public String name;
}