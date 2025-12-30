package com.dsa.arrays.basic.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateQuestion {
    public static class RemoveDuplicateElements{
        public static void main(String[] args) {
            int[] arr={1,2,1,3,4,3,5,2,6,7,8,5};
            String str="Java Developer";
            String strs="This is new word in This new word";
            removeDuplicateElems(arr);
            removeDuplicateElemsJava8(arr);
            showDuplicate(arr);
            showDuplicateJava8(arr);
            showDuplicateCharacterString(str);
            showDuplicateSentence(strs);
            boolean hasDuplicate=checkDuplicates(arr);
            System.out.println(hasDuplicate?"Duplicate Found":"No Duplicate Found");

        }

        private static void showDuplicateSentence(String strs) {
            strs=strs.toLowerCase().replaceAll("[^a-z\\s]","");
            String[] words = strs.split("\\s+");
            Map<String,Integer>map=new LinkedHashMap<>();
            for (String w:words){
                map.put(w,map.getOrDefault(w,0)+1);
            }
            for (Map.Entry<String,Integer>entry:map.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey()+":"+entry.getValue());
                }
            }
        }

        private static void showDuplicateCharacterString(String str) {
            str=str.toLowerCase().replaceAll("\\s+","");
            Set<Character>set=new HashSet<>();
            Set<Character>dup=new LinkedHashSet<>();
            for (char ch:str.toCharArray()){
                if(!set.add(ch)){
                    dup.add(ch);
                }
            }
            System.out.println(dup);
        }

        private static boolean checkDuplicates(int[] arr) {
            Set<Integer>set=new HashSet<>();
            for (int num:arr){
                if(!set.add(num)){
                    return true;
                }
            }
            return false;
        }

        private static void removeDuplicateElemsJava8(int[] arr) {
            Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
            System.out.println("Remove Duplicate.."+set);
        }

        private static void removeDuplicateElems(int[] arr) {
            Set<Integer> set=new HashSet<>();
            for (int num:arr){
                set.add(num);
            }
            System.out.println("Remove Duplicate.."+set);
        }

        private static void showDuplicate(int[] arr) {
            Set<Integer>set=new HashSet<>();
            Set<Integer>dup=new HashSet<>();
            for (int num:arr){
                if(!set.add(num)){
                    dup.add(num);
                }
            }
            System.out.println("Show Duplicate.."+dup);
        }

        private static void showDuplicateJava8(int[] arr) {
            Set<Integer>set=new HashSet<>();
            Set<Integer> set1 = Arrays.stream(arr).filter(x -> !set.add(x)).boxed().collect(Collectors.toSet());
            System.out.println("Show Duplicate..."+set1);
        }


    }

}
