package com.dsa.arrays.basic.arrays.moveElements;

public class StableEvenOddTwoPointer {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 6};
        stableEvenOdd(arr);

        System.out.print("Output: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void stableEvenOdd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // If current element is even, check if it is out of position
            if (arr[i] % 2 == 0) {
                int j = i;

                // Move this even number left until previous element is odd
                while (j > 0 && arr[j - 1] % 2 != 0) {
                    // Shift odd right
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    j--;
                }
            }
        }
    }
}
