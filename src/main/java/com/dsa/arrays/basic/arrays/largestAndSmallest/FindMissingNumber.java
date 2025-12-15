package com.dsa.arrays.basic.arrays.largestAndSmallest;
//TODO: find missing number in sequence
public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=arr.length+1;
        int expSum=n*(n+1)/2;
        int sum=0;
        for (int num:arr)
            sum+=num;
        int missing=expSum-sum;
        System.out.println(missing);
    }
}
