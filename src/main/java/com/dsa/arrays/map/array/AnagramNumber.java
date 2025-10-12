package com.dsa.arrays.map.array;

import java.util.Arrays;

public class AnagramNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 1};

        boolean result = anagramNumber(arr1, arr2);
        System.out.println(result ? "✅ Arrays are Anagram Numbers" : "❌ Arrays are Not Anagram Numbers");
        boolean results = anagramNumberJava8(arr1, arr2);
        System.out.println(results ? "✅ Arrays are Anagram Numbers" : "❌ Arrays are Not Anagram Numbers");
    }


    private static boolean anagramNumber(int[] arr1, int[] arr2) {
        // Step 1: Check length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Step 2: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Compare element by element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    private static boolean anagramNumberJava8(int[] arr1, int[] arr2) {
        boolean equals = Arrays.equals(Arrays.stream(arr1).sorted().toArray(), Arrays.stream(arr2).sorted().toArray());

        return equals;
    }

}
