package com.msilvadev.basicjava.aplicacaojavaexecutavel;

/**
 * @author msilvadev
 */
public class HelloWorld {

  public static void main(String... args){
    System.out.println("Program Running...");

    System.out.println("Properties -> " + HelloWorld.getPropertyValue());

    for(int i=0; i < args.length; i++){
      System.out.println(String.format("Array[%s] - value %s", i, args[i]));
    }
  }

  private static String getPropertyValue(){
    return System.getProperty("profile");
  }
}
