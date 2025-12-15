package com.dsa.arrays.basic.arrays.largestAndSmallest;
//TODO: Find largest elments in an arrays
public class LargestElements {
    public static void main(String[] args) {
        int[]arr={10,20,3,90,25};
        int max=arr[0];
        for (int num:arr){
            if(num>max)
                max=num;
        }
        System.out.println("Largest Elements::"+max);
    }
}
