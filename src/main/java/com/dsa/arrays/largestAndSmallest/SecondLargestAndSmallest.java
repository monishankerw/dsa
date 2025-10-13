package com.dsa.arrays.largestAndSmallest;

import java.util.Arrays;

public  class SecondLargestAndSmallest {
        public static void main(String[] args) {
            // Input array
            int[] array = {4, 2, 3, 1, 0, 6, 12, 15, 20};

            // Sort the array
            Arrays.sort(array);

            // Second largest and second smallest
            int secondLargest = array[array.length - 2];
            int secondSmallest = array[1];

            // Output results
            System.out.println("Second Largest element is: " + secondLargest);
            System.out.println("Second Smallest element is: " + secondSmallest);
        }
    }