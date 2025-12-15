package com.dsa.arrays.basic.arrays.moveElements;

import java.util.Arrays;

public class MoveNegativeElements {
    public static void main(String[] args) {
        int[] arr={-1,2,-3,-4,4,5,6};
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=0){//right
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println("Move Negative Elements::"+ Arrays.toString(arr));
    }
}
