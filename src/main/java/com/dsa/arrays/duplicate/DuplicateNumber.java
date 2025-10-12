package com.dsa.arrays.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4,3,2,4,5};
        duplicateNumber(arr);
        duplicateWithJava8(arr);
    }


    private static void duplicateNumber(int[] arr) {
        Set<Integer> set=new HashSet<>();
        Set<Integer>dup=new HashSet<>();
        for (int num:arr){
            if(!set.add(num)){
                dup.add(num);
            }
        }
        System.out.println("Dup:"+dup);
    }
    private static void duplicateWithJava8(int[] arr) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>dup= Arrays.stream(arr).filter(n->!set.add(n)).boxed().collect(Collectors.toSet());
        System.out.println(dup);
    }

}
