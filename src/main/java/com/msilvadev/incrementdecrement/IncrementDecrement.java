package com.msilvadev.incrementdecrement;

public class IncrementDecrement {

    public static void main(String[] args){
        int i = 5;

        System.out.println("pós-incremento");
        // 5 - pós-incremento, i agora vale 6. primeiro imprime, depois incrementa
        System.out.println(i++);

        // 6 - pós-decremento, i agora vale 5
        System.out.println(i--);

        // 5
        System.out.println(i);

        System.out.println("pré-incremento");
        System.out.println(++i);    // 6 - pré-incremento. incrementa primeiro, depois imprime
        System.out.println(--i);    // 5 - pré-decremento
        System.out.println(i);

        System.out.println();

        int j = 0;

        i = (j++ * j + j++);
        System.out.println(i);
        System.out.println(j);
    }
}

