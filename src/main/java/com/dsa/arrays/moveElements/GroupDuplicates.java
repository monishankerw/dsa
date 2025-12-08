package com.dsa.arrays.moveElements;

import java.util.*;
//Move All Duplicates Together
//Q9. Move all duplicates next to each other (grouping)
//
//Input: [1,3,1,2,3]
//Output: [1,1,3,3,2]
public class GroupDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 3};
        int[] result = groupDuplicates(arr);

        System.out.print("Output: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    private static int[] groupDuplicates(int[] arr) {
        // Step 1: Track first occurrence index
        Map<Integer, Integer> firstIndex = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            firstIndex.putIfAbsent(arr[i], i);
        }

        // Step 2: Convert array to list for stable sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);

        // Step 3: Stable sort based on first occurrence index
        list.sort(Comparator.comparingInt(firstIndex::get));

        // Step 4: Convert back to array
        int[] result = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
