package com.dsa.arrays.largestAndSmallest;

public class MaxMinElements {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 7, 9, 20};
            int max = arr[0], min = arr[0];
            for (int num : arr) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
            System.out.println("Minimum Element: " + min);
            System.out.println("Maximum Element: " + max);
        }
    }