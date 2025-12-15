package com.dsa.arrays.basic.arrays.moveElements;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {1, 0, 4, 0, 7, 0, 6, 0, 7};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
            System.out.println("Move zero::" + Arrays.toString(arr));
        }
    }

