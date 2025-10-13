package com.dsa.arrays.largestAndSmallest;

public  class LargestElement {
        public static void main(String[] args) {
            // Initialize array
            int[] arr = new int[]{25, 11, 7, 75, 56};

            // Initialize max with the first element of the array
            int max = arr[0];

            // Loop through the array
            for (int i = 1; i < arr.length; i++) {
                // Compare each element with max
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Print the largest element
            System.out.println("Largest element present in the given array: " + max);
        }
    }