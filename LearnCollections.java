package com.company.randomcode;

import java.util.*;

public class LearnCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        // methods used in ArrayList
        al1.add(10);
        System.out.println(al1);

        al1.add(0,5);
        System.out.println(al1);

        al1.addAll(al2);
        System.out.println(al1);

        System.out.println(al1.contains(50));

    }

}
