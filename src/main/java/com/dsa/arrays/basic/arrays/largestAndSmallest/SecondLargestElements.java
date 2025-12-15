package com.dsa.arrays.basic.arrays.largestAndSmallest;

//TODO:Find Second Largest Elements
public class SecondLargestElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;

            } else if (n > second && n != max) {
                second = n;
            }

        }
        System.out.println(second);
    }
}
