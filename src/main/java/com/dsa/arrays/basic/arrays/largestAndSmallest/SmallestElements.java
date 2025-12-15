package com.dsa.arrays.basic.arrays.largestAndSmallest;
//TODO: Find Smallest Elements
public class SmallestElements {
    public static void main(String[] args) {
        int []arr={15,42,13,5};
        int min=arr[0];
        for (int num:arr)
            min=num;
        System.out.println("Smallest Elements::"+min);
    }
}
