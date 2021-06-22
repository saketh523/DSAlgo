package com.company.randomcode;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

       /* int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);*/

        Integer[] numbers = {10,11,12,9,8,5,36,100};
        Arrays.sort(numbers);

        for(int i: numbers){
            System.out.print(i+ " ");
        }
        System.out.println();

        Arrays.fill(numbers, 12);

        for(int i: numbers){
            System.out.print(i+ " ");
        }
    }
}
