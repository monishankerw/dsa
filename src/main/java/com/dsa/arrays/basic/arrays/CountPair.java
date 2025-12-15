package com.dsa.arrays.basic.arrays;

import java.util.HashSet;
import java.util.Set;

public class CountPair {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -6, -2};
        int sum = 3;

        countpair(arr, sum);
        findPair(arr, sum);
    }

    private static void countpair(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        Set<String> seen = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            int target = sum - num;

            if (set.contains(target)) {
                String key = Math.min(num, target) + ":" + Math.max(num, target);

                if (!seen.contains(key)) {
                    seen.add(key);
                    count++;
                }
            }
            set.add(num);
        }

        System.out.println("Count = " + count);
    }

    private static void findPair(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int target = sum - num;

            if (set.contains(target)) {
                System.out.println("Pair: (" + target + ", " + num + ")");
            }

            set.add(num);
        }
    }
}
