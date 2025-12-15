package com.dsa.arrays.basic.arrays.moveElements;

public class MoveTargetToEnd {
    public static void main(String[] args) {
        int[] arr = {5, 1, 5, 3, 5, 7};
        int target = 5;

        moveTargetToEnd(arr, target);

        System.out.print("Output: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void moveTargetToEnd(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left until we find a target
            while (left < right && arr[left] != target) {
                left++;
            }

            // Move right until we find a non-target
            while (left < right && arr[right] == target) {
                right--;
            }

            // Swap target (left) with non-target (right)
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
