package com.dsa.arrays.basic.arrays.intersectionUnion;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,3,4};
        Set<Integer> set=new HashSet<>();
        for (int num:arr1)
            set.add(num);
        for (int num:arr2)
            set.add(num);
        System.out.println(set);
    }
}
