package com.dsa.duplicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {
    //TODO:Remove Duplicate Number
    public static class RemoveDuplicate{
        public static void main(String[] args) {
            int[] arr={1,1,2,3,4,5};
            duplicateNumbers(arr);
            duplicateNumbersJava8(arr);
        }

        private static void duplicateNumbersJava8(int[] arr) {
            List<Integer> list = Arrays.stream(arr).distinct().boxed().toList();
            System.out.println(list);
        }

        private static void duplicateNumbers(int[] arr) {
            Set<Integer>s=new LinkedHashSet<>();
            for (int num:arr){
                s.add(num);
            }
            System.out.println(s);
        }
    }
    //TODO:Find Duplicate Elements
    public static class DuplicateElements {
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 2, 4,1};
            duplicateElements(arr);
            duplicateElementsJava8(arr);
        }

        private static void duplicateElementsJava8(int[] arr) {
            Set<Integer>set=new HashSet<>();
            Set<Integer> set1 = Arrays.stream(arr).filter(x -> !set.add(x)).boxed().collect(Collectors.toSet());
            System.out.println(set1);
        }

        private static void duplicateElements(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                if (!set.add(num))
                    System.out.println(num);
            }
        }
    }


    //TODO:Duplicate Character in String
    public static class DuplicateChacInSentence{
        public static void main(String[] args) {
            String str="Java Developer";
            duplicateCha(str);
            String s = str.toLowerCase().replaceAll("\\s+", "");
            Set<Character>set=new HashSet<>();
            Set<Character>dup=new LinkedHashSet<>();
            for (char c:s.toCharArray()){
                if (!set.add(c)){
                    dup.add(c);
                }
            }
            System.out.println(dup);
        }

        private static void duplicateCha(String str) {
            String s = str.toLowerCase().replaceAll("\\s+", "");
            LinkedHashMap<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
            List<Character> list = map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
            System.out.println(list);
        }
    }
    // TODO:Duplicate words in string
    public static class DuplicateWord {

        public static void main(String[] args) {
            String str = "This is new word in This new word";
            duplicateWords(str);
            duplicatesWordsJava8(str);
        }


        private static void duplicateWords(String str) {

            // FIX: keep spaces, normalize case
            String[] words = str.toLowerCase().split("\\s+");

            Map<String, Integer> map = new LinkedHashMap<>();

            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
        }
        private static void duplicatesWordsJava8(String str) {
            String[] word = str.toLowerCase().split("\\s+");
            LinkedHashMap<String, Long> m = Arrays.stream(word).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
            List<String> list = m.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();
            System.out.println(list);
        }

    }

}
