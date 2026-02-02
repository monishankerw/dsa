package com.dsa.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 5, 7);
        List<Integer> evenNumber = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number.."+evenNumber);
        Map<Boolean,List<Integer>> evenOrOdd=list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println("Even:"+evenOrOdd.get(true));
        System.out.println("Odd:"+evenOrOdd.get(false));
        Integer sumOfEvenNumber = list.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("Sum Of Even Number.."+sumOfEvenNumber);
        Integer sumOfInteger = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum Of Integer.."+sumOfInteger);
        Integer sumOfEvenAndSquare = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce(0, Integer::sum);
        System.out.println("Sum Of Even and sqare.."+sumOfEvenAndSquare);
        List<Integer> duplicate = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicate.."+duplicate);
        long divBy = list.stream().mapToInt(x -> x).filter(x -> x % 3 == 0).count();
        System.out.println("Siv by 3.."+divBy);


    }
}
