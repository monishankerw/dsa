package com.dsa.arrays.basic.arrays.intersectionUnion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public  class PrefixCommonArrayOptimized {
        public static int[] findPrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            Set<Integer> seen = new HashSet<>();
            int[] C = new int[n];
            int commonCount = 0;

            for (int i = 0; i < n; i++) {
                if (seen.contains(A[i])) {
                    commonCount++;
                } else {
                    seen.add(A[i]);
                }

                if (seen.contains(B[i])) {
                    commonCount++;
                } else {
                    seen.add(B[i]);
                }

                C[i] = commonCount;
            }

            return C;
        }

        public static void main(String[] args) {
            int[] A = {1, 3, 2, 4};
            int[] B = {3, 1, 2, 4};

            int[] result = findPrefixCommonArray(A, B);
            System.out.println(Arrays.toString(result));  // Output: [0, 2, 3, 4]
        }
    }