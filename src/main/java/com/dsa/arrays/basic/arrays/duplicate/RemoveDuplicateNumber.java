package com.dsa.arrays.basic.arrays.duplicate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,3,5,3};
        removeDuplicateNumber(arr);
        removeDuplicateNumberJava8(arr);
    }


    private static void removeDuplicateNumber(int[] arr) {
        Set<Integer>set=new LinkedHashSet<>();
        for (int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
    private static void removeDuplicateNumberJava8(int[] arr) {
        List<Integer> list = Arrays.stream(arr).distinct().boxed().toList();
        System.out.println(list);
    }

}
