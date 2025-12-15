package com.dsa.arrays.map.array;

import java.util.*;

public class MergeTwoSortedElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 6, 8};

        int[] merged = mergeUsingMap(arr1, arr2);

        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(merged));
    }

    private static int[] mergeUsingMap(int[] arr1, int[] arr2) {

        // TreeMap keeps keys sorted
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Insert elements from arr1
        for (int num : arr1) {
            map.merge(num, 1, Integer::sum);
        }

        // Insert elements from arr2
        for (int num : arr2) {
            map.merge(num, 1, Integer::sum);
        }

        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        // Extract sorted elements with their frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            while (freq-- > 0) {
                result[index++] = key;
            }
        }

        return result;
    }
}
