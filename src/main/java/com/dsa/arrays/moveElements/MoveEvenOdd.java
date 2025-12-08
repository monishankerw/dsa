package com.dsa.arrays.moveElements;

public class MoveEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        moveEvenToFront(arr);

        System.out.print("Output: ");//Output: [2,4,1,3,5]
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void moveEvenToFront(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer until odd is found
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right pointer until even is found
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap odd on left with even on right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
