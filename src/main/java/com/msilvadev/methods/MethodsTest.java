package com.msilvadev.methods;

public class MethodsTest {

    public static void main(String  [ ] args){

    }

    /**
     * O código não compila pois existe um return sem valor e
     * está sendo utilizado um valor não constante no case do switch.
     * @param l
     * @return
     */
    static int x(int l) {
        for(int i=0;i<100;i++) {
            switch(i) {
               // case l:
                 //   System.out.println(l);
                   // if(l==i) return;
                case 0:
                    System.out.println(0);
            }
        }
        System.out.println("Fim");
        return -1;
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
