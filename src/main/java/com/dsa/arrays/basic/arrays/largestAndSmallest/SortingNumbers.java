package com.dsa.arrays.basic.arrays.largestAndSmallest;

import java.util.Arrays;

// 10. Sorting Numbers
    public  class SortingNumbers {
    public static void main(String[] args) {
        int[] arr = {43, 6, 1, 4, 2, 7};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }


    // 11. Second Largest Element
    public static class SecondLargestElement {
        public static void main(String[] args) {
            int[] arr = {2, 6, 3, 4, 5, 1};
            Arrays.sort(arr);
            System.out.println("Second Largest Element: " + arr[arr.length - 2]);
        }
    }
}