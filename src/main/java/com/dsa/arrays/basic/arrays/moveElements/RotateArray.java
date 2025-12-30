package com.dsa.arrays.basic.arrays.moveElements;

//16.rotates arrays
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;

        rotate(arr, n);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void rotate(int[] arr, int n) {
        int len = arr.length;
        n = n % len;

        reverse(arr, 0, n - 1);
        reverse(arr, n, len - 1);
        reverse(arr, 0, len - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
