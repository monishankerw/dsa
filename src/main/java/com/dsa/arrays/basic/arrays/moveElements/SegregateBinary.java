package com.dsa.arrays.basic.arrays.moveElements;

public class SegregateBinary {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1};
        segregate(arr);

        System.out.print("Output: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left until we find a 1
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Move right until we find a 0
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap: left found a 1, right found a 0
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
