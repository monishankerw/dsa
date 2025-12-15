package com.dsa.arrays.basic.arrays.moveElements;

import java.util.*;

public class GroupDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 3, 6, 6, 7, 4, 8};
        int[] result = groupDuplicates(arr);

        System.out.print("Output: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    private static int[] groupDuplicates(int[] arr) {
        // Step 1: Count frequency of each element
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> duplicates = new ArrayList<>();
        List<Integer> uniques = new ArrayList<>();

        // Step 2: Build duplicates and uniques list in stable order
        for (int num : arr) {
            if (freq.get(num) > 1) {
                duplicates.add(num);
            } else {
                uniques.add(num);
            }
        }

        // Step 3: Merge duplicates first, then uniques
        duplicates.addAll(uniques);

        // Step 4: Convert back to array
        int[] result = new int[arr.length];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }
        return result;
    }
}
