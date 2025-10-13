package com.dsa.arrays.intersectionUnion;

//20. subset
    public  class SubSet {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5}; // Main array
        int arr2[] = {3, 4, 12};      // Array to check as subset
        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("arr2[] is a subset of arr1[]");
        } else {
            System.out.println("arr2[] is not a subset of arr1[]");
        }
    }

    private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        for (int i = 0; i < n; i++) {
            boolean found = false; // Flag to check if arr2[i] exists in arr1
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break; // Exit the inner loop if a match is found
                }
            }
            if (!found) {
                return false; // If arr2[i] is not found in arr1, return false
            }
        }
        return true; // All elements of arr2[] are found in arr1[]
    }
}
