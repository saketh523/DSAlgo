package com.company.randomcode;
import java.util.Arrays;
public class LearnArrays {
    public static void main(String[] args) {

        // one-dimensional array
        int[] numberArray = new int[10];

        for(int i=0; i<numberArray.length;i++){
            numberArray[i] = i;
        }
        int k = 0;
        while(k<62){System.out.print('-'); k++; }
        System.out.println();

        for(int j =0;j<numberArray.length; j++){
            System.out.print("| " + numberArray[j] + " ");
        }
        System.out.println("|");

        // Multidimensional array

        String[][] multiArray = new String[10][10];

        for(int i = 0; i<multiArray.length; i++){
            for( int j=0; j< multiArray[0].length; j++){
                multiArray[i][j] = i + " " + j;
            }
        }
        k = 1;
        while(k<62){System.out.print('-'); k++; }
        System.out.println();
        for(int i = 0; i<multiArray.length; i++){
            for( int j=0; j< multiArray[0].length; j++){
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }
        k=1;
        while(k<62){System.out.print('-'); k++; }
        System.out.println();

        // enhanced for loop

        for(int row: numberArray){
            System.out.print(row);
        }
        System.out.println("\n");

        for(String[] rows: multiArray){
            for(String column : rows){
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }
    }
}
