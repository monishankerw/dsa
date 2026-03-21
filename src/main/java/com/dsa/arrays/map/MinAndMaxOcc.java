package com.dsa.arrays.map;

import java.util.HashMap;
import java.util.Map;

public class MinAndMaxOcc {
    public static class MostFreOcc{
        public static void main(String[] args) {
            int[]arr={1,2,1,3,4,1,5,2};
            mostFreOcc(arr);
        }
        private static void mostFreOcc(int[] arr) {
            Map<Integer,Integer> map=new HashMap<>();
            for (int num:arr){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int result=-1,mostCount=0;
            for (Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getValue()>mostCount){
                    mostCount=entry.getValue();
                    result=entry.getKey();
                }
            }
            System.out.println(result);
        }
    }

    public static class MaxOccChar {

        public static void main(String[] args) {
            String str = "successfully";

            maxOccChar(str);
            minOccChar(str);
        }

        private static void maxOccChar(String str) {
            Map<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            char result = ' ';
            int maxcount = 0;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxcount) {
                    maxcount = entry.getValue();
                    result = entry.getKey();
                }
            }

            System.out.println("MaxOcc " + result);
        }

        private static void minOccChar(String str) {
            Map<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            char result = ' ';
            int mincount = Integer.MAX_VALUE;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() < mincount) {
                    mincount = entry.getValue();
                    result = entry.getKey();
                }
            }

            System.out.println("MinOcc " + result);
        }

}
}
