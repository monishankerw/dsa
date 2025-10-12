package com.dsa.arrays.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CheckDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 3, 7, 5, 8};

        boolean hasDuplicate = checkDuplicate(arr);
        System.out.println(hasDuplicate ? "✅ Duplicates found" : "❌ No duplicates");
    }

    private static boolean checkDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }


    public static class CheckDuplicates {
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 2, 3, 7, 5, 8};

            boolean hasDuplicate = Arrays.stream(arr).boxed()
                    .collect(Collectors.toSet())
                    .size() < arr.length;

            System.out.println(hasDuplicate ? "✅ Duplicates found" : "❌ No duplicates");
        }
    }
}
