package com.dsa.java8;

import com.dsa.arrays.basic.PrimeNumber;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 5, 7);
//        List<Integer> primeNum = list.stream().filter(PrimeNumber::isPrimes).toList();
//        System.out.println("Prime number"+primeNum);
        List<Integer> evenNumber = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number.."+evenNumber);

        Map<Boolean,List<Integer>> evenOrOdd=list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println("Even:"+evenOrOdd.get(true));
        System.out.println("Odd:"+evenOrOdd.get(false));
        Integer sumOfEvenNumber = list.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("Sum Of Even Number.."+sumOfEvenNumber);
        Integer sumOfInteger = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum Of Integer.."+sumOfInteger);
        list.stream().mapToInt(x->x).max().ifPresent(max-> System.out.println("Max:"+max));
        list.stream().mapToInt(x->x).min().ifPresent(min-> System.out.println("Min:"+min));
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        Integer sumOfEvenAndSquare = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).reduce(0, Integer::sum);
        System.out.println("Sum Of Even and sqare.."+sumOfEvenAndSquare);
        OptionalDouble average = list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).average();
        System.out.println("Average..."+average);
        List<Integer> duplicate = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicate.."+duplicate);
        long count = list.stream().count();
        System.out.println("Count{}"+count);
        long divBy = list.stream().mapToInt(x -> x).filter(x -> x % 3 == 0).count();
        System.out.println("Siv by 3.."+divBy);
        //Accending
        List<Integer> list1 = list.stream().sorted().toList();
        System.out.println("Sorting Accending Order"+list1);
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorting Decending Order"+list2);
        List<List<Integer>> list3 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 5), Arrays.asList(6, 7, 3));
        List<Integer> merge = list3.stream().flatMap(List::stream).toList();
        System.out.println("Merge Elements"+merge);
        Stream<Integer> distinct = list3.stream().flatMap(List::stream).distinct();
        System.out.println("DDDD"+distinct);

//Convert a list of number to ASCII Character
        List<Integer> list4 = Arrays.asList(54, 64, 65, 34, 75, 87);
        list4.stream().mapToInt(x->x).mapToObj(c->(char)c).forEach(c-> System.out.println("CHAR"+c));
        int[]arr={1,2,3,4,5,2};
        Arrays.stream(arr).distinct().forEach(x-> System.out.println("Remove dup"+x));
    }
    public static boolean isPrimes(int x){
        int n=0;
        for (int i=2;i<x/2;i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    //
}
