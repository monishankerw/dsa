package com.dsa.java8;

import com.dsa.arrays.basic.PrimeNumber;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 5, 7);
        List<String> word = Arrays.asList("apple", "banana", "cherry", "app", "application");
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
        //Second highest Number
        Optional<Integer> first1 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("Second highest elements"+first1);
        List<Integer> list6 = list.stream().filter(x -> x % 2 == 0).limit(6).toList();
        System.out.println(list6);
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
        int[]arr1={1,2,1,3,2,1,3,4,2};
        int k=2;
        Map<Integer, Long> FreOCC = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("Fre OCC"+FreOCC);
        Map<Integer, java.lang.Long>map =Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        List<Integer> list5 = map.entrySet().stream().filter(e -> e.getValue() == k).map(Map.Entry::getKey).toList();
        System.out.println("Kth Freq Occ"+list5);
        Optional<Map.Entry<Integer, Long>> first = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst();
        System.out.println("Find Non repeating number"+first);
        Map<Object, Long> collect = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(x ->x, Collectors.counting()));
        collect.forEach((k1,v)-> System.out.println(k+"->"+v));
        //Show Duplicate
        HashSet<Object> set = new HashSet<>();
        Set<Integer> set1 = Arrays.stream(arr1).filter(x -> !set.add(x)).boxed().collect(Collectors.toSet());
        System.out.println("Show duplicate"+set1);

        List<String> upperCase = word.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);
        List<String> startWith = word.stream().filter(w -> w.startsWith("a")).toList();
        System.out.println(startWith);
        Map<Integer, List<String>> grouplength = word.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouplength);
        long count1 = word.stream().filter(x -> x.length() > 3).count();
        System.out.println("Count Length::"+count1);
        List<String> sort = word.stream().sorted().toList();
        System.out.println("Sort alph"+sort);
        word.stream().mapToInt(String::length).forEach(l-> System.out.println(l));
        Optional<String> reduce = word.stream().reduce((x, y) -> x.length() > y.length() ? x : y);
        System.out.println(reduce);

        //Frequency occurence
        String input="aavmprqounba";
        String []str=input.split(" ");
        Map<String, Long> freqOcc = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Freq Occ"+freqOcc);
        //Count character occurrence  in a string
        String inputs="hello word";
        Map<Character, Long> map1 = inputs.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Count character occurrence  in a string"+map1);
        //Frequence occ word
        String str1="Test I Test my Test abc";
        String[] words = str1.split("\\s+");
        Map<String, Long> freqOccWords = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqOccWords);

        //Freq Occ Character
        char[]c={'a','a','d','w','t','q','t'};
        new String(c).chars().mapToObj(c1->(char)c1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //Find duplicate charcters woth occurence>1
        List<String> dupGraterThan1 = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() >1).map(Map.Entry::getKey).toList();
        System.out.println(dupGraterThan1);

        //Find unique elements
        List<String> uniqueElements = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println(uniqueElements);

        //Find the first non-repeating elements
        Optional<String> firstNonRepeating = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();
        System.out.println(firstNonRepeating);

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
