package com.company.randomcode;

public class LearnBitManipulation {
    public static void main(String[] args) {
        int number = 16;
        int i = 4;
        int res = 0;
        int mask = 0;

        // Finding ith bit of a number;
            // using right shift
        res = (number >> i) & 1;
        System.out.println(res!=0 ? "Element is 1" : "Element is 0");
            // using left shift
        mask = (1 << i);
        number = mask & number;

        System.out.println(number==0 ? "Element is 0" : "Element is 1");

        // Set ith bit of a number;

        number = 16;
        i = 3;
        res = 0;
        mask = 0;

        //using left shift

    mask = ( 1<< i);
    number = mask | number;
        System.out.println(number);

        // clear ith bit
        number = 24;
        i = 3;
        res = 0;
        mask = 0;

        mask = ~(1 << i);

        number = number & mask;
        System.out.println(number);

        number = 13;

        int value = number & (number-1);
        System.out.println(value);

        //
        int count = 0;
        while(number > 0){
            count++;
            number = number & (number-1) ;

        }
        System.out.println(count);


    }
}
