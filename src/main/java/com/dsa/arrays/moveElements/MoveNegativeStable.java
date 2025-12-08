package com.dsa.arrays.moveElements;

//Move all negative numbers to the left (stable order preserved) Example: Input: [3, -1, 4, -2, 5] Output: [-1, -2, 3, 4, 5]
public class MoveNegativeStable {
    public static void main(String[] args) {
        int[] arr = {3, -1, 4, -2, 5};
        moveNegativeStable(arr);

        System.out.print("Output: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void moveNegativeStable(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // Check if arr[i] is negative
            if (arr[i] < 0) {
                int j = i;

                // Shift positive values right until correct position is found
                while (j > 0 && arr[j - 1] >= 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            }
        }
    }
}
