package com.msilvadev.rackerhank;

import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Object> stack = new Stack<Object>();

        for(int i=1; i <= 3; i++){
            stack.push(scan.nextLine());
        }

        System.out.println("String: " + stack.pop());
        System.out.println("Double: " + Double.valueOf(stack.pop().toString()));
        System.out.println("Int: " + stack.pop());
    }
}
