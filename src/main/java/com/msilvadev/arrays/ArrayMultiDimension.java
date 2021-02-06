package com.msilvadev.arrays;

public class ArrayMultiDimension {

    public static void main(String args[]){
        int[][] multi = new int[10][10];

        int[][] cube[] = new int[10][][];

        int[][] test = new int[][]{{1,2,3}, {1,2,3}, {1,2,3}};

        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test.length; j++){
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
    }
}
