package com.msilvadev.manipulationstrings;

public class TestStringBufferAndStringBuilder {

    public static void main(String args[]){
        StringBuffer stringBuffer = new StringBuffer("Matheus");
        stringBuffer.append(" - Software Engineer"); // StringBuffer is mutable, we can change your value
        System.out.println(stringBuffer); // System.out.println will call toString()

        StringBuffer stringBuffer1 = new StringBuffer(2);// The value 2, will be the capacity of this array
        System.out.println(stringBuffer1.capacity());
        stringBuffer1.append("a");
        stringBuffer1.append("a");
        stringBuffer1.append("c");// *** PESQUISAR E ENTENDER COMO O JAVA RECALCULA A CAPACIDADE ***
        System.out.println(stringBuffer1.capacity());

        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer); //We can create new StringBuffer from another StringBuffer
        stringBuffer2.append(" - new StringBuffer created from another");
        System.out.println(stringBuffer2.toString());

        StringBuffer stringBuffer3 = new StringBuffer("Test");
        stringBuffer3.insert(4, " insert");// Receives the position where you will insert and the text that needs to be inserted
        System.out.println(stringBuffer3);

        stringBuffer3.delete(4, 11);// Deletes the text between position 4 until position 11 of StringBuilder
        System.out.println(stringBuffer3);

        System.out.println(stringBuffer.reverse());
    }

}
