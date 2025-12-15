package com.dsa.arrays.basic.arrays.largestAndSmallest;

import java.util.ArrayList;

public  class FirstAndLastElement {
        public static void main(String[] args) {
            // Input ArrayList
            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(2);
            list.add(3);
            list.add(1);
            list.add(6);

            // Find the first and last elements
            int first = list.get(0); // First element
            int last = list.get(list.size() - 1); // Last element

            // Output results
            System.out.println("First element is: " + first);
            System.out.println("Last element is: " + last);
        }
    }