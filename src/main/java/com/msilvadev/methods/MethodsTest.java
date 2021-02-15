package com.msilvadev.methods;

public class MethodsTest {

    public static void main(String  [ ] args){

    }
}

class ClassWithMethods{

    int getNumber() {
        return 5;
    }

    /**
     * We need cover all possibilities with return.
     * @param i
     * @return
     */
    String getText(int i) {
        if(i > 0) return "greater";
        else if(i < 0) return "less";

        return "";
    }
}
